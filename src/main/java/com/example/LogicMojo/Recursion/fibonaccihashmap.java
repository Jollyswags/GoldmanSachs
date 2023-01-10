package com.example.LogicMojo.Recursion;

import java.util.HashMap;

public class fibonaccihashmap {
    public static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String args[])
    {
        map.put(0,0);
        map.put(1,1);
        fib(45);
        for(int i:map.keySet())
            System.out.print(map.get(i)+ " ");
        //System.out.println(map.size());
    }
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(map.containsKey(n))
            return map.get(n);
        int left = fib(n-1);
        int right=fib(n-2);
        map.put(n,(left+right));
        return left+right;

    }
}
//SC: O(n)
//TC: O(n)
