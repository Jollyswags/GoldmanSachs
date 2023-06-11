package com.example.java.thread.threadlocalvariable;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoTask implements Runnable{
    private static final AtomicInteger nextId= new AtomicInteger(0);
    private static final ThreadLocal<Integer> threadId=new ThreadLocal<Integer>() {
       @Override
        protected Integer initialValue()

        {
            return nextId.getAndIncrement();
        }

    };
    public int getThreadId(){
        return threadId.get();
    }
    private static final ThreadLocal<Date> startDate= new ThreadLocal<Date>(){
        protected Date initialValue(){
            return new Date();
        }
    };
    @Override
    public void run(){
        System.out.printf("Starting .: %s : %s\n",getThreadId(),startDate.get());
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.printf("Ending : %s : %s\n",getThreadId(),startDate.get());

    }
}

