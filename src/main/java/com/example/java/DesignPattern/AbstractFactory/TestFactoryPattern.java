package com.example.java.DesignPattern.AbstractFactory;
public class TestFactoryPattern
{
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
/*
In Abstract Factory pattern an
interface is responsible for creating a factory of related objects without explicitly
 specifying their classes.
 Abstract Factory Pattern isolates the client code from concrete (implementation)
 classes.
It eases the exchanging of object families.
It promotes consistency among objects.

 */