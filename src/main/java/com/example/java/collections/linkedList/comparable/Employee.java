package com.example.java.collections.linkedList.comparable;

public class Employee implements Comparable<Employee>{
    String name;
    String id;
   Employee(String name, String id){
       this.name=name;
       this.id=id;
   }

    public int compareTo(Employee emp)
    {
        return this.id.compareTo(emp.id);
    }
}
