package com.example.java.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicMain {
    public static void main(String[] args) {
        CyclicBarrier obj = new CyclicBarrier(3);
        Thread t1=new Thread(new Task(obj),"Thread 1");
        Thread t2=new Thread(new Task(obj),"Thread 2");
        Thread t3=new Thread(new Task(obj),"Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
