package com.example.java.exceptionhandling.finallyfeature.trywithresource;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Main obj=new Main();
        obj.trywithresource();
    }
    public void trywithresource(){
        try(FileOutputStream fs=new FileOutputStream("//Users//swagatasarbobhoum//Desktop//interviews//Groupon - LeetCode.pdf")){
            String msg = "Welcome to javaTpoint!";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            fs.write(byteArray);
            System.out.println("Message written to file successfuly!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
