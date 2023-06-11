package com.example.java.collections.linkedList.iteration;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> list= new LinkedList<>();
        list.add(new Employee("Swagata","199847"));
        list.add(new Employee("Jolly","15516"));
        list.add(new Employee("Rupa","677789"));
        list.add(new Employee("Dada","78906"));


        System.out.println("******************************************** FOR LOOP ********************************\n");
        for(Employee data: list) {
            System.out.print(data.name);
            System.out.println("    "+data.id);

        }

        System.out.println("******************************************** FOR LOOP ********************************\n");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i).name);
            System.out.println("   "+list.get(i).id);
        }
        System.out.println("\n************************************ ITERATOR *******************************************************\n");
        Iterator<Employee> iterator = list.iterator();

        while(iterator.hasNext()){
            Employee e=iterator.next();
            System.out.print(e.name);
            System.out.println("     "+e.id);
        }


        ListIterator<Employee> listIterator = list.listIterator();
        System.out.println("******************************* list iterator NEXT ***************************************************\n");
        while(listIterator.hasNext()){
            Employee e=listIterator.next();
            System.out.print(e.name);
            System.out.println("      "+e.id);
        }

        System.out.println("********************************** List Iterator PREVIOUS ***********************************\n");
        while (listIterator.hasPrevious()){
            Employee e=listIterator.previous();
            System.out.print(e.name);
            System.out.println("    "+e.id);
        }

        System.out.println("***************************************** FOR EACH *****************************************\n");
        list.forEach(data -> {
            System.out.print(data.id);
            System.out.println("     "+data.name);
        });



    }
}
