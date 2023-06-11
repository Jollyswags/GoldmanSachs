package com.example.java.collections.treeset;


import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> set= new TreeSet<>();
        set.add(new Product("amul","123","milk"));
        set.add(new Product("dairy milk","1234","chocolate"));
        set.add(new Product("dominos","5678","pizza"));
        set.add(new Product("dominos","5678","pizza"));
        //set.add(null);


        set.forEach(a->{
            if(a==null)
                System.out.println("Null");
            else
                System.out.println(a.name+"   "+ a.id+"  "+a.description);
        });



    }
}
