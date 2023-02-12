package com.example.LogicMojo.Practice;

public class Powerof2 {
    public static boolean power(int n)
    {
        if(n==0)
            return false;
        int x=(int) Math.floor(Math.log(n)/Math.log(2));
        int y=(int) Math.ceil(Math.log(n)/Math.log(2));
        return x==y;
    }

    public static void main(String args[])
    {
        System.out.println(power(5));
    }
}
