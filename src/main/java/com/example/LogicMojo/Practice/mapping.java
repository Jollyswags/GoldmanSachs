package com.example.LogicMojo.Practice;

import java.util.*;

public class mapping {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        HashMap<String, Integer> map =new HashMap<>();
        map.put("Jolly",24);
        map.put("Ma",56);
        map.put("Baba",64);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String name=iterator.next().getKey();
            if(map.get(name)>25)
                iterator.remove();
        }
        System.out.println(map);
    }
}
