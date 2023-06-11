package com.example.java.thread.synchronization.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
    Semaphore obj=new Semaphore((2));//(2,true) fairness locking

    public static void main(String[] args) {
        final SemaphoreMain classobj = new SemaphoreMain();
        new Thread(()->classobj.mutualExclusion()).start();
        new Thread(()->classobj.mutualExclusion()).start();
        new Thread(()->classobj.mutualExclusion()).start();

    }
    void mutualExclusion(){
        try{
            obj.acquire();
            System.out.println(Thread.currentThread().getName()+" inside");
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            obj.release();
            System.out.println(Thread.currentThread().getName()+" outside");

        }
    }
}
