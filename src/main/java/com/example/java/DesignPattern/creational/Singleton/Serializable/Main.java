package com.example.java.DesignPattern.creational.Singleton.Serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            DemoSingleton instance1 = DemoSingleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(
                    new FileOutputStream("file.text"));

            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(
                    new FileInputStream("file.text"));
            DemoSingleton instance2
                    = (DemoSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
