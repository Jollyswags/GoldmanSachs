package com.example.LogicMojo.Recursion;

public class functiondemo {
        public static void main(String args[])
        {
            print(5);
        }
        public static void print(int i)
        {
            if(i==0)
                return;
            print(i-1);
            System.out.print(i + " ");
        }
}

