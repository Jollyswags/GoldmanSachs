package com.example.java.thread.basic.synchronization;

public class SharedResource {
    public synchronized void sharedMethod(String ip) throws InterruptedException {
        System.out.println("Starting: "+ Thread.currentThread().getName()+" ip "+ip);
        try {
            Thread.sleep(5000);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Ending :"+Thread.currentThread().getName());

    }
}
