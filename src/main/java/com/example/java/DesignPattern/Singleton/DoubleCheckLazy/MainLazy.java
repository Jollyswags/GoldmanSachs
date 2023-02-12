package com.example.java.DesignPattern.Singleton.DoubleCheckLazy;

import com.example.java.DesignPattern.Singleton.Lazy.LazySingleton;

public class MainLazy {
    public static void main(String[] args) {
        new Thread(()->{
            LazySingleton inst1= LazySingleton.getInstance();
            System.out.println(inst1.hashCode());}).start();
        new Thread(()->{
            LazySingleton inst2= LazySingleton.getInstance();
            System.out.println(inst2.hashCode());}).start();
        new Thread(()->{
            LazySingleton inst3= LazySingleton.getInstance();
            System.out.println(inst3.hashCode());}).start();
    }
}
