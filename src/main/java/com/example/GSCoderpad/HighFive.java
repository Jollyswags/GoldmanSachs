package com.example.GSCoderpad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HighFive {
    public static int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            map.computeIfAbsent(id, k -> new PriorityQueue<>((a, b) -> b - a)).add(score);
        }
        int[][] result = new int[map.size()][2];
        int idx = 0;
        for (Integer id : map.keySet()) {
            PriorityQueue<Integer> scoresInOrder = map.get(id);
            int totalScore = 0;
            int count = Math.min(5, scoresInOrder.size());
            for (int i = 0; i < 5 && !scoresInOrder.isEmpty(); i++) {
                totalScore += scoresInOrder.poll();
            }
            result[idx++] = new int[]{id, totalScore / count};
        }
        Arrays.sort(result, (a, b) -> a[0] - b[0]);
        return result;
    }

    public static void main(String[] args) {
        int results[][]={{1,91},{1,92},{2,93},{2,99},{2,98},{2,97},{1,60},{1,58},{2,100},{1,61}};
        for(int[] a:highFive(results))
        {
            System.out.println(a[0]);
            System.out.println(a[1]);
        }
    }
}
