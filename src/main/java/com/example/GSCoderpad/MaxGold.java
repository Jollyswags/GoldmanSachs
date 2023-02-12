package com.example.GSCoderpad;

public class MaxGold {

    public static int findMaxGold(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = m - 1; i >= 0; i-- ) {
            for (int j = 0; j < n; j++ ) {
                dp[i][j] += grid[i][j];

                if ( i < m - 1 && j > 0) {
                    dp[i][j] += Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                else if (i < m - 1) {
                    dp[i][j] += dp[i + 1][j];
                }
                else if ( j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[0][ n -1];

    }
    public static void main(String[] args) {

        //start from bottom left and destination top right, can move only up and right.
        int[][] grid = {{0,0,0,0,5},
                {0,1,1,1,0},
                {2,0,0,0,0}};

        System.out.println(findMaxGold(grid));
    }
}