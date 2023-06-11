package com.example.java.collections.linkedList.comparable;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> list=new LinkedList<>();
        list.add(new Employee("Swagata","1234"));
        list.add(new Employee("Jolly","5678"));
        list.add(new Employee("Rupa","9101112"));
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(a->System.out.println(a.name+"   "+ a.id));
    }
}
