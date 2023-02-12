package com.example.LogicMojo.Practice;

import java.util.ArrayList;
import java.util.List;

public class Subset2 {
    public static List<List<Integer>> subsetsWithDup(int n, List<Integer> matrix) {
        List<List<Integer>> arr = new ArrayList<>();
        getSubset(matrix,0,new ArrayList<Integer>(),n,arr);
        return arr;
    }
    private static void getSubset(List<Integer> nums, int i, List<Integer> list,int n,List<List<Integer>> arr) {
        if(i==nums.size()){
            if(!arr.contains(list))
                arr.add(new ArrayList<>(list));
            return;
        }

        list.add(nums.get(i));
        getSubset(nums,i+1,list,n,arr);
        list.remove(list.size()-1);
        getSubset(nums,i+1,list,n,arr);

    }
    public static void main(String args[])
    {
        int n=4;
        List<Integer> matrix= new ArrayList<>();
        matrix.add(4);
        matrix.add(4);
        matrix.add(7);
        matrix.add(8);

        System.out.println(subsetsWithDup(n, matrix));
    }
}
