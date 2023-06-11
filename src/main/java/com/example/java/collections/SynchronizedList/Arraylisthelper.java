package com.example.java.collections.SynchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylisthelper {
    public void helper() throws InterruptedException {

        System.out.println("Starting     "+ Thread.currentThread().getName());
        List<Integer> list = new ArrayList<Integer>();

        // populate the list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // printing the Collection
        System.out.println("List : " + list);

        // create a synchronized list
        List<Integer> synlist = Collections
                .synchronizedList(list);

        synlist.forEach(a->System.out.println(a));
        System.out.println("Ending     "+Thread.currentThread().getName());
    }
}
