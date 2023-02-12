package com.example.java.InterfaceExample;

public interface Vehicle {

    int noOfWheels = 4;
    //public static final int noOfWheels = 4;

    void start();

    public abstract void stop();

    default void print() {
        System.out.println("print");
    }

}
