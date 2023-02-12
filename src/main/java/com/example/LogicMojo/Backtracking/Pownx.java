package com.example.LogicMojo.Backtracking;

public class Pownx {
    public static double Pow(int x, int n) {
        // Write your code here
        if(n == Integer.MIN_VALUE) {
            if(x>1.0)
                return 0;
            return 1;
        }

        double X=x;
        int N=n;

        if(N<0)
        {
            N= -N;
            X= 1/X;
        }

        return halfPow(X, N);

    }
    private static double halfPow(double x, int n) {
        // base case, if n is zero
        if(n == 0) {
            return 1;
        }
        // if n is 1 just return the value
        if(n == 1) {
            return x;
        }

        // get the half of power
        int half = n / 2;
        double halfPow = halfPow(x, half);

        if(n % 2 == 0) {
            // if it's an even number just multilply two halfes
            return halfPow * halfPow;
        } else {
            // if it's an odd number multiply two halves and 'x'
            return halfPow * halfPow * x;
        }
    }
    public static void main(String args[])
    {
        System.out.println(Pow(4,3));
    }
}
