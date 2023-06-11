package com.example.java.exceptionhandling.basic;

public class MainMulitipleCatch {
    public static void main(String[] args) {
        MainMulitipleCatch obj=new MainMulitipleCatch();
        try{
            obj.dividebyzerofunc(2,0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public void dividebyzerofunc(int a, int b){
        int c=a/b;
        System.out.println(c);
    }
}
