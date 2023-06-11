package com.example.java.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{
    CyclicBarrier barrier;
    public Task(CyclicBarrier barrier)
    {
        this.barrier=barrier;
    }
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" inside");
            barrier.await();
            System.out.println(Thread.currentThread().getName()+" outside");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (BrokenBarrierException e)
        {
            e.printStackTrace();
        }
    }
}
