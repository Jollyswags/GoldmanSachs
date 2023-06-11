package com.example.java.collections.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylistclass {
    public void helper() throws InterruptedException {
        System.out.println("Starting     "+ Thread.currentThread().getName());
        Thread.sleep(80);
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.forEach(a->System.out.println(a));
        System.out.println("Ending     "+Thread.currentThread().getName());

    }
}
