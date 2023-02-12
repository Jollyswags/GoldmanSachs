package com.example.java.InterfaceExample;

public class Truck implements Vehicle {
    public void start() {
        System.out.println("Start method");
    }

    @Override
    public void stop() {
        System.out.println("Stop Method");
    }

}