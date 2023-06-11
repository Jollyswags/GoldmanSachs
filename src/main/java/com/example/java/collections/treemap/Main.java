package com.example.java.collections.treemap;


import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Employee,Address > map=new TreeMap<>();
        map.put(new Employee("Swagata","15516"),new Address("221001","Varanasi","UP"));
        map.put(new Employee("Jolly","109001"),new Address("566013","Bangalore","Karnataka"));
        map.put(new Employee("Swagata","15516"),new Address("566067","Whitefield","Karnataka"));
        map.forEach((key,value)->
                {
                    System.out.print(key.id+"  "+key.name+"          ");
                    System.out.println(value.pin+"   "+value.city+"  "+value.state);
                }
        );
    }
}
