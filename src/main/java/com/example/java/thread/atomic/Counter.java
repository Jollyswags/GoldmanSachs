package com.example.java.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value= new AtomicInteger();
    public void increment(){
        value.getAndIncrement();
    }
    public void decrement(){
        value.getAndDecrement();
    }
    public int get(){
        return value.get();
    }
}
