package com.example.java.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountdownlatchDemo {
    public static void main(String[] args) {
        final CountDownLatch latch=new CountDownLatch(2);
        Thread cacheService = new Thread(new Service("CacheService",3000,latch));
        Thread alertService = new Thread(new Service("AlertService",3000,latch));
        Thread validationService = new Thread(new Service("ValidationService",3000,latch));
        cacheService.start();
        alertService.start();
        validationService.start();
        try{
            latch.await();
            System.out.println("All services are up");

        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
