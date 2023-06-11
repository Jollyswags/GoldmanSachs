package com.example.java.generics.rawtypes;

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}