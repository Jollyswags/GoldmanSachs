package com.example.LogicMojo.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
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

    public static List<List<Integer>> subsetsWithDup(int x, List<Integer> matrix) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();
        getSubset(matrix,0,new ArrayList<Integer>(),x,arr);
        return arr;

    }
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(subsetsWithDup(4,list));
    }
}
