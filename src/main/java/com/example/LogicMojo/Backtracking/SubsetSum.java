package com.example.LogicMojo.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void subsetSumsHelper(int ind, int sum, List < Integer > arr, int N, ArrayList < Integer > sumSubset)        {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }


    public static List<Integer> subsetSum(List<Integer> arr, int N) {
        // Write your code here;
        ArrayList < Integer > sumSubset = new ArrayList< >();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;

    }
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(subsetSum(list,2));
    }
}
