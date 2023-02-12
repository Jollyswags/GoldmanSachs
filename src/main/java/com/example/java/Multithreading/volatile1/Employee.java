package com.example.java.Multithreading.volatile1;

public class Employee {
    private volatile static Employee obj; //volatile variable

    public static Employee getInstance() {

        if (obj == null) {
            //synchronized (Employee.class) {
            if (obj == null) {
                obj = new Employee();
            }
            // }

        }
        return obj;

    }
}