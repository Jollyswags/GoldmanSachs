package com.example.LogicMojo.Backtracking;

import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static List<Integer> list;
    public static List<List<Integer>> ans;
    public static void helper(List<Integer> nums)
    {
        if(list.size()== nums.size())
            ans.add(new ArrayList<>(list));
        else
        {
            for(int i=0; i<nums.size(); i++)
            {
                if(list.contains(nums.get(i)))
                    continue;
                list.add(nums.get(i));
                helper(nums);
                list.remove(list.size()-1);
            }
        }

    }

    public static List<List<Integer>> permutations(int n, List<Integer> arr) {
        // Write your code here
        list = new ArrayList<>();
        ans = new ArrayList<>();
        helper(arr);
        return ans;

    }
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(permutations(3,list));
    }
}
