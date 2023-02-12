package com.example.GSCoderpad;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> list=new LinkedList<>();
        for(int in[]:intervals)
        {
            if(list.isEmpty() || list.getLast()[1]<in[0])
                list.add(in);
            else
                list.getLast()[1]=Math.max(list.getLast()[1],in[1]);
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        for(int arr[]: merge(intervals))
        {
            System.out.print(arr[0]+" ");
            System.out.println(arr[1]);
        }
    }
}
