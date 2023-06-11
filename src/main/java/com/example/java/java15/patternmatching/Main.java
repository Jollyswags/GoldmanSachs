package com.example.java.java15.patternmatching;

public class Main {
    public static void main(String[] args) {
        Human h=new Human();
        System.out.println(checkObj(h));
    }
    public static String checkObj(Object obj){
        return  switch (obj)
        {
            case Human h->"This is human";
            case Circle c->"This is circle";
            default -> "This is default";
        };

    }

}
