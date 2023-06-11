package com.example.java.exceptionhandling.basic;

public class WithoutCatch {
    public static void main(String[] args) {
        WithoutCatch obj=new WithoutCatch();
        obj.dividebyzero(2,0);
    }
    public void dividebyzero(int a, int b){
        System.out.println(a/b);
    }
}
