package com.example.LogicMojo.Backtracking;

public class NumberIsPalindrome {
    public static int isPalindrome(int x) {
        // Write your code here
        if(x<0)
            return 0;
        if(x>=0 && x<=9)
            return 1;
        int rev=0;
        int n=x;
        while(x>0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return rev==n?1:0;

    }
    public static void main(String args[])
    {
        System.out.println(isPalindrome(121));
    }
}
