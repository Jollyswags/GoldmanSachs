package com.example.java.Multithreading.Basics;

public class SharedResource {
    public  synchronized void  sharedMethod() {
        System.out.println("Shared Resource Start : " + ThreadClass.currentThread().getName());
        try {
            //Thread.sleep(30000);
            wait(30000);
            //Thread.yield();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Shared Resource End : " + ThreadClass.currentThread().getName());
    }

    public  void  sharedMethod1() {
        System.out.println("Shared Resource Start : " + ThreadClass.currentThread().getName());
        synchronized(SharedResource.class) {  //synchronized block
            try {
                ThreadClass.sleep(30000);
                //wait(30000);
                //Thread.yield();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Shared Resource End : " + ThreadClass.currentThread().getName());
    }
}
