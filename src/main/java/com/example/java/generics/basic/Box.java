package com.example.java.generics.basic;

public class Box<T> {
    T obj;
    Box(T obj)
    {
        this.obj=obj;
    }
    T getObj(){
        return this.obj;
    }
}
