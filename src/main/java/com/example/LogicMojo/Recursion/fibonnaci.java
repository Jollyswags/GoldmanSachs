package com.example.LogicMojo.Recursion;

public class fibonnaci {
    public static void main(String args[])
    {

        System.out.println(fib(6));
    }

    public static int fib(int n)
    {
        if(n==0)
            return 0;
        else
            if(n==1)
                return 1;
            else
                return fib(n-1)+ fib(n-2);
    }
}
//SC : O(n)
//TC : O(2^n)