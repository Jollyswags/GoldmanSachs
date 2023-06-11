package com.example.java.generics.rawtypes;

public class GenericsTester {
    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>();

        box.set(Integer.valueOf(10));
        System.out.printf("Integer Value :%d\n", box.getData());


        Box rawBox = new Box();

        //No warning
        rawBox = box;
        System.out.printf("Integer Value :%d\n", rawBox.getData());
        rawBox.set(Integer.valueOf(10));
        System.out.printf("Integer Value :%d\n", rawBox.getData());
        box = rawBox;
        System.out.printf("Integer Value :%d\n", box.getData());
    }
}
