package com.example.LogicMojo.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationSequenceBacktrack {
    public static void main(String args[]) {
        System.out.println(getPermutation(3, 3));
    }
    public static String getPermutation(int n, int k) {
        int num[] = new int[n];
        for(int i=0; i<n; i++)
        {
            num[i] = i+1;
        }
        List<String> Tans = new ArrayList<>();
        help(0,num,n,k,Tans);
        Collections.sort(Tans);
        return Tans.get(k-1);
    }
    public static void help(int index, int[] num, int n, int k, List<String> Tans)
    {
        if(index==num.length)
        {
            String str="";
            for(int i=0;i<n;i++)
                str+=num[i];
            Tans.add(str);
            return;
        }
        for(int i=index;i<n;i++)
        {
            swap(i,index,num);
            help(index+1,num,n,k,Tans);
            swap(i,index,num);
        }
    }
    public static void swap(int i, int j, int[] num)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
