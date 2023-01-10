package com.example.LogicMojo.Recursion;
//SC: O(N)
//TC: O(N)
public class palindrome {
    public static void main(String args[])
    {
        String str="swagata";
        boolean flag=checkpalindrome(str,0,str.length()-1);
        System.out.println(flag);
    }
    public static boolean checkpalindrome(String str, int i, int j)
    {
        if(i>=j)
            return true;
        if(str.charAt(i)==str.charAt(j))
            return checkpalindrome(str, i+1, j-1);
        return false;

    }
}
