package com.example.java.java11.random;

import java.util.ArrayList;
import java.util.List;

public class javafeatures {
    public String repeatStr(String str, int n)
    {
        return str.repeat(n);
    }
    public boolean checkBlank(String str)
    {
        return str.isBlank();
    }
    public String  strip(String str){
        return str.strip();
    }
    public String  stripLead(String str){
        return str.stripLeading();
    }
    public String  stripTrail(String str){
        return str.stripTrailing();
    }

    public List<String> lines(String str){
        List<String> lines = new ArrayList<>();
        str.lines().forEach(line -> lines.add(line));
        return lines;
    }

    public static void main(String[] args) {
        javafeatures obj=new javafeatures();
        System.out.println(obj.repeatStr("Swagata",5));
        System.out.println("*******************************");
        System.out.println(obj.checkBlank(""));
        System.out.println("*******************************");
        System.out.println(obj.strip("    Swagata    "));
        System.out.println("*******************************");
        System.out.println(obj.stripLead("     Swagata    "));
        System.out.println("*******************************");
        System.out.println(obj.stripTrail("     Swagata     "));
        System.out.println("*******************************");
        System.out.println(obj.lines("swagata\nsarbobhoum"));

    }
}
