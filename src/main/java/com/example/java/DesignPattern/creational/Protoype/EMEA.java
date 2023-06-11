package com.example.java.DesignPattern.creational.Protoype;

public class EMEA implements Report{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public EMEA clone() throws CloneNotSupportedException {
        System.out.println("Cloning EMEA object..");
        return (EMEA) super.clone();
    }
    @Override
    public String toString() {
        return "EMEA Report";
    }

}
