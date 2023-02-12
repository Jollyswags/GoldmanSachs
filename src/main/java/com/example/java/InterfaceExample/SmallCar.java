package com.example.java.InterfaceExample;
public class SmallCar implements Vehicle {

    public void start() {
        System.out.println("Start method");
    }

    @Override
    public void stop() {
        System.out.println("Stop Method");
    }

}
