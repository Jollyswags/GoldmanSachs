package com.example.java.thread.basic.join;

public class JoinMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            try{
                System.out.println("Starting: "+Thread.currentThread().getName());
                Thread.sleep(5000);
            }
            catch (InterruptedException exception)
            {
                exception.printStackTrace();
            }
        });
        t1.start();
        t1.join();
        System.out.println(Thread.currentThread().getName());
    }
}
