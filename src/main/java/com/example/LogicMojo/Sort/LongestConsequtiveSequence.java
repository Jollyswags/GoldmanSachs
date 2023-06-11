package com.example.LogicMojo.Sort;
import java.util.*;
public class LongestConsequtiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int current=0,len=0;
        for(int i: nums)
        {
            set.add(i);
        }
        for(int num: set)
        {
            if(!set.contains(num-1))
            {
                current= num;
                int longeststreak=1;

                while(set.contains(current+1))
                {
                    current+=1;
                    longeststreak+=1;
                }

                len=Math.max(len,longeststreak);
            }
        }
        return len;
    }
    public static void main(String args[]){
        LongestConsequtiveSequence obj=new LongestConsequtiveSequence();
        int nums[]={100,4,200,1,3,2};
        System.out.println(obj.longestConsecutive(nums));

    }
}
