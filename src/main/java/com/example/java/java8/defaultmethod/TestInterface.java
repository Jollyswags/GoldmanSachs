package com.example.java.java8.defaultmethod;

public interface TestInterface {
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
