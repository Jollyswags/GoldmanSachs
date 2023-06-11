package com.example.java.thread.executor.submit;

import java.util.concurrent.Callable;

public class DiscoveryCallable implements Callable<String> {
    String ip;

    public DiscoveryCallable(String ip){
        this.ip = ip;
    }

    @Override
    public String call() {
        System.out.println("Start "+ip+ " "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End "+ip+ " "+Thread.currentThread().getName());
        return ip;
    }
}
