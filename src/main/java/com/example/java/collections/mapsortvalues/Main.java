package com.example.java.collections.mapsortvalues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Employee, String> map=new HashMap<>();
        map.put(new Employee("Swagata","15517"),"MuSigma");
        map.put(new Employee("Jolly","199001"),"GS");
        map.put(new Employee("Swagata","15516"),"Hp");
        List list = new LinkedList(map.entrySet());
//Custom Comparator
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap nmap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();)
        {
            Map.Entry entry = (Map.Entry) it.next();
            nmap.put(entry.getKey(), entry.getValue());
        }

        nmap.forEach((key,value)->
                {
                    System.out.print(key+"  ");
                    System.out.println(value);
                }
        );

    }
}
