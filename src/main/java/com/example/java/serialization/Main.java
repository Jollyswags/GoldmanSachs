package com.example.java.serialization;

import java.io.*;

public class Main {
    static final String filePath = "/Users/swagatasarbobhoum/Desktop/java/emp.ser";

    static void serialize(Employee emp) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(emp);
            outputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    static Employee deserialize() {
        Employee savedUser = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            savedUser = (Employee) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }

        return savedUser;
    }

    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("Swagata");

        serialize(emp);

        Employee res = deserialize();

        System.out.println(res);
    }
}
