package com.example.java.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public String saveUser(User user) throws SQLException{
        String response= null;
        try(Connection conn = DBConncetion.getConnection();){
            String sql= "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
            String inputStr="C://Users//Regu//Pictures//download.jpg";
            PreparedStatement statement=conn.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullName());
            statement.setString(4, user.getEmail());
            //statement.setBlob(3,inputStr);
            int rowInserted= statement.executeUpdate();
            if(rowInserted>0)
            {
                response="A new user was inserted successfully!";
            }


        } catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
    public String updateUser(User user) throws SQLException{
        String response= null;
        try(Connection conn = DBConncetion.getConnection();){
            String sql= "UPDATE Users SET password=?, fullname=?, email=? WHERE user_id=?";
            PreparedStatement statement=conn.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullName());
            statement.setString(4, user.getEmail());
            int rowInserted= statement.executeUpdate();
            if(rowInserted>0)
            {
                response="A new user was updated successfully!";
            }


        } catch (Exception e){
            e.printStackTrace();
        }
        return response;

    }
    public String deleteUser(int id) throws SQLException{
        Connection conn = null;
        String response = null;
        try {
            conn = DBConncetion.getConnection();
            String sql = "DELETE FROM Users WHERE user_id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was deleted successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }

        return response;

    }
    public List<User> getAllUsers() throws SQLException{
        Connection conn=null;
        List<User> users=null;
        try{
            conn=DBConncetion.getConnection();
            String sql= "SELECT * FROM Users";
            Statement statement = conn.createStatement();
            ResultSet result= statement.executeQuery(sql);
            users = new ArrayList<>();
            while (result.next()) {
                User user = new User();
                user.setFullName(result.getString("fullname"));
                user.setEmail(result.getString("email"));
                users.add(user);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return users;
    }
}
