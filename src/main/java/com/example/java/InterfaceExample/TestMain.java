package com.example.java.InterfaceExample;

public class TestMain {
    public static void main(String[] args) {
        Vehicle v = new SmallCar();
        v.start();
        v.stop();
        v.print(); //calling default method
        System.out.println(Vehicle.noOfWheels); // calling static variable
    }
}
