package com.example.java.thread.basic.thread;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("...."+Thread.currentThread().getName());
    }
}
