package com.example.LogicMojo.Recursion;

import java.util.ArrayList;
import java.util.List;
//TC: O(2^n)
//SC: O(n)
public class AllSubsequenceOfArray {//Backtracking
    public static List<Integer> path = new ArrayList<>();
    public static void main(String args[])
    {
        int arr[]={1, 2,3};

        generatesubsequence(arr,0,path);
    }
    public static void generatesubsequence(int[] arr,int i, List<Integer> path)
    {
        if(i==arr.length)
        {
            if(path.size()>=0)
            {
                System.out.print(path+" ");
            }
        }
        else
        {
            generatesubsequence(arr, i+1, path);
            path.add(arr[i]);
            generatesubsequence(arr, i+1, path);
            path.remove(path.size()-1);

        }
        return;
    }
}
/*
                    {}
                  /    \
                 /      \
                /        \
               /          \
              /            \
            {}             {1}
            /\              /\
           /  \            /  \
         {}    {2}      {1}    {1,2}


 */
