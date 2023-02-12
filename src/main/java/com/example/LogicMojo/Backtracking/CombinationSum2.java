package com.example.LogicMojo.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class CombinationSum2 {
    public static void backtrack(LinkedList<Integer> comb, int remain, int curr, List<int[]> counter, List<List<Integer>> results) {
        if (remain <= 0) {
            if (remain == 0) {
                // make a deep copy of the current combination.
                results.add(new ArrayList<Integer>(comb));
            }
            return;
        }

        for (int nextCurr = curr; nextCurr < counter.size(); ++nextCurr) {
            int[] entry = counter.get(nextCurr);
            Integer candidate = entry[0], freq = entry[1];

            if (freq <= 0)
                continue;

            // add a new element to the current combination
            comb.addLast(candidate);
            counter.set(nextCurr, new int[]{candidate, freq - 1});

            // continue the exploration with the updated combination
            backtrack(comb, remain - candidate, nextCurr, counter, results);

            // backtrack the changes, so that we can try another candidate
            counter.set(nextCurr, new int[]{candidate, freq});
            comb.removeLast();
        }
    }
    public static List<List<Integer>> combinationSum2(int target, int n, List<Integer> candidates) {
        // Write your code here
        // container to hold the final combinations
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int candidate : candidates) {
            if (counter.containsKey(candidate))
                counter.put(candidate, counter.get(candidate) + 1);
            else
                counter.put(candidate, 1);
        }

        // convert the counter table to a list of (num, count) tuples
        List<int[]> counterList = new ArrayList<>();
        counter.forEach((key, value) -> {
            counterList.add(new int[]{key, value});
        });

        backtrack(comb, target, 0, counterList, results);
        return results;

    }
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(1);
        list.add(5);
        System.out.println(combinationSum2(8,7,list));
    }
}
