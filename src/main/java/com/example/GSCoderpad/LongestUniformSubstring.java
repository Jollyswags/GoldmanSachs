package com.example.GSCoderpad;

import java.util.Arrays;

public class LongestUniformSubstring {
    public static int[] repeatedSubstring(String s){
        if(s.length() == 0) return new int[]{-1,0};
        if(s.length() == 1) return new int[]{0,1};
        int idx = -1;
        int maxCharCount = 0;
        int count = 1;
        int i;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else{
                if(count > maxCharCount){
                    maxCharCount = count;
                    idx = i - count;
                }
                count = 1;
            }
        }
        if(count > maxCharCount){
            maxCharCount = count;
            idx = i - count;
        }
        return new int[]{idx, maxCharCount};
    }

    public static void main(String[] args) {
        Arrays.stream(repeatedSubstring("10000111")).forEach(nums->System.out.print(nums+" "));
    }
}
