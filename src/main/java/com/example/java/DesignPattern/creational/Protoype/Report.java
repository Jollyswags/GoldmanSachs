package com.example.java.DesignPattern.creational.Protoype;

public interface Report extends  Cloneable{
    public Report clone() throws CloneNotSupportedException;
}
