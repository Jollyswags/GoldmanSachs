package com.example.java.DesignPattern.creational.AbstractFactory;

public class SedanCar extends Car {
    public SedanCar(Location location)
    {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Sedancar");
    }
}