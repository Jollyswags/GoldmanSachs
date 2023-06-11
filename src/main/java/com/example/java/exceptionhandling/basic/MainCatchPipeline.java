package com.example.java.exceptionhandling.basic;

public class MainCatchPipeline {
    public static void main(String[] args) {
        MainCatchPipeline obj=new MainCatchPipeline();
        try{
            obj.dividebyzero(4,0);
        }
        catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }

    }
    public void dividebyzero(int a, int b){
        int c=a/b;
        System.out.println(c);

    }
}
