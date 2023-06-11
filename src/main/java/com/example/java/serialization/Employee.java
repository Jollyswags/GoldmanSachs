package com.example.java.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int empId;
    //private transient String empName;
    private String empName;
    public  static final String ORG_NAME = "INTEL";
    public static final long SerialVersionUUID= 10L;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}