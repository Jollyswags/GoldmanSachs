package com.example.java.collections.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Arraylistclass obj=new Arraylistclass();
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
