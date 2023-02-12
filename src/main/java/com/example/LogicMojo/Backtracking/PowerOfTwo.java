package com.example.LogicMojo.Backtracking;

public class PowerOfTwo {
    public static int powerOfTwo(int n) {
        // Write your code here
        if (n == 0)
            return 0;

        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))))?1:0;

    }
    public static void main(String args[])
    {
        System.out.println(powerOfTwo(4));
    }
}
