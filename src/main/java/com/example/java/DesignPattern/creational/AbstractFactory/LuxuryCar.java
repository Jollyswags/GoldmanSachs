package com.example.java.DesignPattern.creational.AbstractFactory;

public class LuxuryCar extends Car
{
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("luxuryCar");
    }
}