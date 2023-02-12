package com.example.GSCoderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static List<Integer> twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int res=target-nums[i];
            if(map.containsKey(res) && map.get(res)!=i)
            {
                list.add(i);
                list.add(map.get(res));
                return list;
            }

        }
        return list;

    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        System.out.println(twoSum(nums,9));
    }
}
