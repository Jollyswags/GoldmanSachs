package com.example.java.thread.basic.lambda;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("New Child Thread 1 : " + Thread.currentThread().getName());
        });
        t1.start();
    }
}
