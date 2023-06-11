package com.example.java.collections.arrayList.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Swagata","1234"));
        list.add(new Employee("Jolly","5678"));
        list.add(new Employee("Rupa","9101112"));
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(a->System.out.println(a.name+"   "+ a.id));
    }
}
