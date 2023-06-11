package com.example.java.collections.arrayList.comparator;

import java.util.Comparator;

public class Comparatornew implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        int comp= e2.getName().compareTo(e1.getName());
        if(comp!=0)
            return comp;
        comp= e1.getId().compareTo(e2.getId());
        return comp;
    }
}
