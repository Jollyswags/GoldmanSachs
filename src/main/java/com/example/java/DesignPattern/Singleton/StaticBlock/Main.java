package com.example.java.DesignPattern.Singleton.StaticBlock;

public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            StaticBlockSingleton inst1=StaticBlockSingleton.getInstance();
            System.out.println(inst1.hashCode());}).start();
        new Thread(()->{StaticBlockSingleton inst2=StaticBlockSingleton.getInstance();
            System.out.println(inst2.hashCode());}).start();
        new Thread(()->{StaticBlockSingleton inst3=StaticBlockSingleton.getInstance();
            System.out.println(inst3.hashCode());}).start();
    }
}
