package com.example.GSCoderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreaterAverage {
    public static String greateravg(String array[][]){
        String str="";
        Map<String, List<Integer>> map= new HashMap<>();
        for(String arr[]:array)
        {
            String name=arr[0];
            if(!map.containsKey(name))
            {
                List<Integer> list = new ArrayList<>();
                list.add(Integer.valueOf(arr[1]));
                map.put(name,list);
            }
            else
            {
                List<Integer> list=map.get(name);
                list.add(Integer.valueOf(arr[1]));
                map.put(name,list);

            }
        }
        int max=-1;
        for(String name: map.keySet())
        {
            int sum=0;
            for (int marks: map.get(name))
            {
                sum+=marks;
            }
            if(sum>=max)
            {
                str=name;
                max=sum;
            }
        }
        return str;
    }
    public static void main(String args[]){
        String scores[][] = {{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}};
        System.out.println(greateravg(scores));
    }
}
