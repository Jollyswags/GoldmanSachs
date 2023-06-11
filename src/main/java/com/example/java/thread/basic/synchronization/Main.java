package com.example.java.thread.basic.synchronization;

public class Main {
    public static void main(String[] args) {
        SharedResource obj=new SharedResource();
        Thread t1= new Thread(()->{
            try {
                obj.sharedMethod("10.0.0.9");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t1.start();
        Thread t2= new Thread(()->{
            try {
                obj.sharedMethod("10.0.0.5");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t2.start();
    }
}
