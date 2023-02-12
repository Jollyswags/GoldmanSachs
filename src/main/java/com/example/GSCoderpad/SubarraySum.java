package com.example.GSCoderpad;
import java.util.*;
public class SubarraySum {
    public static int subarraySum(int[] nums, int sum) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int res=0;
        int i,currsum=0;
        map.put(0,1);
        for(i=0;i<nums.length;i++)
        {
            currsum+=nums[i];
            res+=map.getOrDefault(currsum-sum,0);
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
}
