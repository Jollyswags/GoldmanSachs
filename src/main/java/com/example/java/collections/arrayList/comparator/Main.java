package com.example.java.collections.arrayList.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Swagata","199847"));
        list.add(new Employee("Swagata","199889"));
        list.add(new Employee("Jolly","15516"));
        list.add(new Employee("Jolly","15514"));
        list.add(new Employee("Rupa","677789"));
        list.add(new Employee("Rupa","677780"));
        list.add(new Employee("Dada","78906"));
        list.add(new Employee("Dada","78905"));

        Collections.sort(list,new Comparatornew());
        System.out.println("********************************** NEW COMPARATOR ***********************************\n");
        list.forEach(data -> {
            System.out.print(data.id);
            System.out.println("     "+data.name);
        });
        System.out.println("********************************** LAMBDA ***********************************\n");

        list.sort((emp1,emp2) ->emp1.getName().compareTo(emp2.getName()));
        list.forEach(data -> {
            System.out.print(data.id);
            System.out.println("     "+data.name);
        });
        System.out.println("********************************** COMPARING ***********************************\n");
        list.sort(Comparator.comparing(Employee::getName));
        list.forEach(data -> {
            System.out.print(data.id);
            System.out.println("     "+data.name);
        });

        Collections.sort(list,new Comparatornew());
        System.out.println("********************************** NEW COMPARATOR USING TWO FEATURE ***********************************\n");
        list.forEach(data -> {
            System.out.print(data.id);
            System.out.println("     "+data.name);
        });
    }
}
