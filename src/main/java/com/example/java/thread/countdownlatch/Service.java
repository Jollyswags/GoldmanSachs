package com.example.java.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable{
    final String name;
    final int timeToStart;
    final CountDownLatch latch;
    public Service(String name,int timeToStart, CountDownLatch latch)
    {
        this.name=name;
        this.timeToStart=timeToStart;
        this.latch=latch;
    }
    @Override
    public void run(){
        try{
            Thread.sleep(timeToStart);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " is up");
        latch.countDown();
    }
}
