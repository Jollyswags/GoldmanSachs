package com.example.java.thread.threadlocalvariable;

public class MainClass {
    public static void main(String[] args) {
        DemoTask demo= new DemoTask();
        Thread t1=new Thread(demo);
        t1.start();
        Thread t2=new Thread(demo);
        t2.start();

    }
}
