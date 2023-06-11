package com.example.java.thread.executor.invokeAll;

public class DiscoveryRunnable implements Runnable{
    String ip;

    public DiscoveryRunnable(String ip){
        this.ip = ip;
    }

    @Override
    public void run() {
        System.out.println("Start "+ip+ " "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End "+ip+ " "+Thread.currentThread().getName());
    }
}
