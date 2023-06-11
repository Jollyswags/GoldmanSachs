package com.example.java.java8.defaultmethod;

public class TestClass implements TestInterface{
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);

        d.show();
    }

}
