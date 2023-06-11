package com.example.google.longestabsolutefilepath;
import java.util.*;
public class Solution {
    public int lengthLongestPath(String input) {
        int maxlen=0;
        int ans= 0;
        int temp=0;
        Stack<String> stack=new Stack<>();
        stack.push("0");
        String files[]=input.split("\n");

        stack.push(files[0]);
        int len=stack.peek().length();
        if(stack.peek().contains("."))
            ans=len;

        for(int i=1;i<files.length;i++)
        {

            String currStr=files[i];
            int currLen= !currStr.contains("\t")?-1:currStr.substring(0,currStr.lastIndexOf("\t")).length();
            int topLen= !stack.peek().contains("\t")?-1:stack.peek().substring(0,stack.peek().lastIndexOf("\t")).length();

            if(currLen==topLen+1){
                stack.push(currStr);
                temp= currStr.substring(currStr.lastIndexOf("\t")+1).length();
                len+= temp +1;
            }
            else {
                while(topLen+1!=currLen){
                    String popped=stack.pop();
                    temp=popped.substring(popped.lastIndexOf("\t")+1).length();
                    len-= temp +1;
                    if(stack.peek().equals("0"))
                        break;
                    topLen= !stack.peek().contains("\t")?-1:stack.peek().substring(0,stack.peek().lastIndexOf("\t")).length();

                }
                stack.push(currStr);
                temp=currStr.substring(currStr.lastIndexOf("\t")+1).length();
                len+=temp + 1;
            }
            maxlen= Math.max(maxlen,len);
            if(currStr.contains(".")){
                ans=maxlen;
            }
        }
        return ans;
    }

}
