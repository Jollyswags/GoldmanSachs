package com.example.java.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<Object> queue=new LinkedBlockingQueue<>(20);
        int numProducer=4;
        int numConsumer=4;

        for(int i=0;i<numProducer;i++){
            new Thread(new Producer(queue)).start();
        }
        for(int i=0;i<numConsumer;i++){
            new Thread(new Consumer(queue)).start();
        }
        Thread.sleep(10*100);
        System.exit(0);
    }
}