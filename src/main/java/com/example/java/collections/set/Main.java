package com.example.java.collections.set;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Product> set= new HashSet<>();
        set.add(new Product("amul","123","milk"));
        set.add(new Product("dairy milk","1234","chocolate"));
        set.add(new Product("dominos","5678","pizza"));
        set.add(new Product("dominos","5678","pizza"));
        set.add(null);


        set.forEach(a->{
            if(a==null)
                System.out.println("Null");
            else
            System.out.println(a.name+"   "+ a.id+"  "+a.description);
        });


    }
}
