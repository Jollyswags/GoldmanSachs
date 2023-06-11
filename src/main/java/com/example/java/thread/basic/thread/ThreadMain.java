package com.example.java.thread.basic.thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadClass task=new ThreadClass();
        task.start();
    }
}
