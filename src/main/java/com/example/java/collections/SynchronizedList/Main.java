package com.example.java.collections.SynchronizedList;


public class Main {
    public static void main(String[] args) {
        Arraylisthelper obj=new Arraylisthelper();
        Thread t1 = new Thread(() -> {

            try {
                obj.helper();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                obj.helper();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t2.start();
    }
}
