package com.example.java.java9.privateinterface;

public interface Report {
    public default void apacReport(){
        hqlaCalculation();
    }
    public default void emeaReport(){
        hqlaCalculation();

    }

    private static void hqlaCalculation(){
        System.out.println("HQLA Calculator");

    }
    public static void breachCalculation(){
        hqlaCalculation();
        System.out.println("breach calculator");
    }
}
