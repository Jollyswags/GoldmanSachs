package com.example.GSCoderpad;

public class PowerOfTen {
    public static boolean isPowerOfTen(int n) {
        return (Math.log10(n) / Math.log10(10)) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTen(20));
    }
}
