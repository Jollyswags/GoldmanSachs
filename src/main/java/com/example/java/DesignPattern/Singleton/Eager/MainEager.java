package com.example.java.DesignPattern.Singleton.Eager;

public class MainEager {
    public static void main(String[] args) {
        new Thread(()->{
            EagerSingleton inst1=EagerSingleton.getInstance();
            System.out.println(inst1.hashCode());}).start();
        new Thread(()->{EagerSingleton inst2=EagerSingleton.getInstance();
            System.out.println(inst2.hashCode());}).start();
        new Thread(()->{EagerSingleton inst3=EagerSingleton.getInstance();
            System.out.println(inst3.hashCode());}).start();
    }
}
