package com.example.GSCoderpad;

public class RunLengthEncoding {
    public static String compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1 ; i < chars.length ;i++){
            if(chars[i] != chars[i-1]){
                sb.append(chars[i-1]);
                if(count != 1){
                    sb.append(String.valueOf(count));
                }
                count = 1;
            }
            else{
                count++;
            }
        }

        sb.append(chars[chars.length-1]);
        if(count != 1){
            sb.append(String.valueOf(count));
        }
        for(int i = 0;i<sb.toString().length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        char chars[]={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

}
