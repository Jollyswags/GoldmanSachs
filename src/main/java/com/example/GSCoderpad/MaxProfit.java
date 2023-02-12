package com.example.GSCoderpad;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1])
                maxprofit+=prices[i]-prices[i-1];
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
