package com.example.java.DesignPattern.structural.Adapter;

public class AdapterMain {
    public static void main(String[] args)
    {
        DataAdaptee adaptee = new DataAdaptee();
        AdapterInterface target = new JSON_adaptee(adaptee);
        System.out.println(target.GetData());


    }
}
