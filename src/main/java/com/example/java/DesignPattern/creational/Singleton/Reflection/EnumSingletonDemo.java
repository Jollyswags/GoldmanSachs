package com.example.java.DesignPattern.creational.Singleton.Reflection;

public class EnumSingletonDemo {

    public static void main(String[] args) {

        //System.out.println(SingletonEnum.INSTANCE);
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println("instance1 hashCode:- "
                + instance2.hashCode());

    }
}

enum SingletonEnum{
    INSTANCE;
    SingletonEnum()
    {
        System.out.println("SingletonEnum Constructor ");
    }
}