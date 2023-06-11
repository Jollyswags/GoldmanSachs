package com.example.java.java13;

public class yieldswitch {
    public static void main(String[] args) throws IllegalArgumentException{
        String n= "Wednesday";
        int x=switch (n){
            case "Monday":
                yield 1;
            case "Tuesday":
                yield 2;
            case "Wednesday":
                yield 3;
            case "Thursday":
                yield 4;
            case "Friday":
                yield 5;
            case "Saturday":
                yield 6;
            case "Sunday":
                yield 7;
            default:
                throw new IllegalArgumentException();
        };

        System.out.println(x);
    }
}
