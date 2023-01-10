package com.example.LogicMojo.Recursion;
//SC: O(N)
//TC: O(N)
public class Sumoffirstnnumbers {
    public static void main(String args[])
    {
        //int arr[]={1,2,3,4,5,8};
        int n=5;
        int sum= summation(n,1,0);
        System.out.println(sum);
    }
    public static int summation(int n,int i, int sum)
    {
        if(i>n)
            return sum;
       return summation(n,i+1,sum+i);


    }
}
