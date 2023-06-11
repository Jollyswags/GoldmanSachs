package com.example.java.DesignPattern.creational.Protoype;

public class APAC implements Report{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public APAC clone() throws CloneNotSupportedException {
        System.out.println("Cloning APAC object..");
        return (APAC) super.clone();
    }
    @Override
    public String toString() {
        return "APAC Report";
    }
}
