package com.example.GSCoderpad;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int vol;
        int max=0;
        int i=0,j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                vol = (j-i)*height[i];
                i++;
            }else{
                vol = (j-i)*height[j];
                j--;
            }
            max=Math.max(max,vol);
        }
        return max;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
