package com.example.LogicMojo.Practice;

public class Fibonacci {
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++)
        {
            int sum= a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static void main(String args[])
    {
        System.out.println(fib(5));
    }
}