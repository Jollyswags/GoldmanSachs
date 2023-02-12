package com.example.GSCoderpad;

public class MaxProfitCar {
    public static void main(String []args){
        int [][] IntervalList = {{1,2},{2,4},{4,8}};
        int [] IntervalPrice = {10, 30, 25};
        int MaxPrice = 0;
        int bestDeal =0;
        for (int i=0 ;i< IntervalList.length; i++)
            if (MaxPrice < IntervalPrice[i]/(IntervalList[i][1]-IntervalList[i][0]))
            {
                MaxPrice=IntervalPrice[i]/(IntervalList[i][1]-IntervalList[i][0]);
                bestDeal=i;
            }


        System.out.println("BestDeal = " + IntervalList[bestDeal][0] + "," + IntervalList[bestDeal][1]);
    }
}
