package com.example.java.thread.volatilepackage;

public class Employee {
    private volatile static Employee obj; //volatile variable

    public static Employee getInstance() {

        if (obj == null) {
            if (obj == null) {
                obj = new Employee();
            }
        }
        return obj;

    }
}
