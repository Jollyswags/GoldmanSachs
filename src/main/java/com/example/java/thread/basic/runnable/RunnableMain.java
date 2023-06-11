package com.example.java.thread.basic.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableTask task=new RunnableTask();
        Thread t1=new Thread(task);
        t1.start();
    }
}
