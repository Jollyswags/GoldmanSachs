package com.example.java.Multithreading.forkJoin;

public class AvailableProcessor {
    public static void main(String[] args) {
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Processor :" + numberOfProcessors);
    }
}
