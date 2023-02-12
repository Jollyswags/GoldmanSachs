package com.example.GSCoderpad;

public class TrappingRainWater {
    public int trap(int[] height){
        int left=0, right= height.length-1,lmax=0,rmax=0;
        int ans=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(lmax<=height[left]){
                    lmax=height[left];
                }
                else{
                    ans+=lmax-height[left];
                }
                ++left;
            }
            else{
                if(rmax<=height[right])
                    rmax=height[right];
                else
                    ans+=rmax-height[right];
                --right;

            }
        }
        return ans;
    }

    public static void main(String args[]){
        TrappingRainWater obj=new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(height));

    }

}
