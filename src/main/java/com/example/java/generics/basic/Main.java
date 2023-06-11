package com.example.java.generics.basic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> iObj = new Box(15);
        System.out.println(iObj.getObj());

        // instance of String type
        Box<String> sObj
                = new Box<String>("Swagata");
        System.out.println(sObj.getObj());
    }
}
