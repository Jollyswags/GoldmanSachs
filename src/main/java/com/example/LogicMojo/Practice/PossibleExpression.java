package com.example.LogicMojo.Practice;

import java.util.ArrayList;
import java.util.List;

public class PossibleExpression {
    static List<String> result= new ArrayList<>();
    public static List<String> addOperators(String num, int target) {
        dfs(0,"",0,0,num,target);
        return result;
    }
    public static void dfs(int index, String exp, long resSoFar, long prev, String num, int target){
        if(index==num.length())
        {
            if(resSoFar==target)
            {
                result.add(exp);
            }
            return;
        }
        for(int i=index; i<num.length(); i++)
        {
            if(i>index && num.charAt(index)=='0')
                break;
            long currnum= Long.parseLong(num.substring(index, i+1));
            if(index==0)
            {
                dfs(i+1, exp + currnum, currnum, currnum, num, target);
            }
            else
            {
                dfs(i+1, exp + "+" + currnum, resSoFar + currnum, currnum, num, target);
                dfs(i+1, exp + "-" + currnum, resSoFar - currnum, -currnum, num, target);
                dfs(i+1, exp + "*" + currnum, resSoFar - prev + prev * currnum, prev * currnum, num, target);
            }

        }
    }
    public static void main(String args[])
    {
        System.out.println(addOperators("123",6));
    }
}
