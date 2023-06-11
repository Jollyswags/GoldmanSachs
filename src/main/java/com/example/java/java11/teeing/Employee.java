package com.example.java.java11.teeing;

public class Employee {
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }

}
