package com.example.java.DesignPattern.creational.Factory;

public class Main {
    public static void main(String[] args) {
        Region region=Region.EMEA;
        Report report=UserInput.createReport(region);
        System.out.println(report.getReport());

    }

}
