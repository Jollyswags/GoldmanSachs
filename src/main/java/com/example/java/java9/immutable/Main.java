package com.example.java.java9.immutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Swagata", "Jolly");
        Set<String> set = Set.of("Swagata","Sarbobhoum");
        Map<String,String> namesMap=Map.ofEntries(Map.entry("1","Cake"),Map.entry("2","Biscuit"));

        System.out.println(list);
        System.out.println(set);
        System.out.println(namesMap);

        list.add("Sarbobhoum");//unsupportedoperationException


    }
}
