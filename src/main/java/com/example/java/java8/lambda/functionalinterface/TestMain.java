package com.example.java.java8.lambda.functionalinterface;

public class TestMain {
    public static void main(String[] args) {
        MyFunctionalInterface lambda = () ->  System.out.println("Executing...");
        lambda.execute();
        Addition addition= (a, b)-> a + b;
        int res=addition.add(10,20);
        System.out.println(res);

    }
}
