package com.example.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Employee,Address> map=new HashMap<>();
        map.put(new Employee("Swagata","15516"),new Address("221001","Varanasi","UP"));
        map.put(new Employee("Jolly","199001"),new Address("566013","Bangalore","Karnataka"));
        map.put(new Employee("Swagata","15516"),new Address("566067","Whitefield","Karnataka"));

        for (Map.Entry<Employee,Address> mapElement : map.entrySet()){
            Employee e=mapElement.getKey();
            System.out.println(e.id+"  "+e.name);

            Address  a=mapElement.getValue();
            System.out.println(a.pin+"   "+a.city+"  "+a.state);


        }
        map.forEach((key,value)->
        {
            System.out.print(key.id+"  "+key.name+"          ");
            System.out.println(value.pin+"   "+value.city+"  "+value.state);
        }
        );
    }
}
