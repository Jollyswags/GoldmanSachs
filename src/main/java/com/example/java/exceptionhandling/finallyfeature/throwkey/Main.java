package com.example.java.exceptionhandling.finallyfeature.throwkey;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        Main obj=new Main();
        obj.dividebyzero(2,0);
    }
    public void dividebyzero(int a, int b){
        try{
            System.out.println(a/b);
        }

        finally {
            System.out.println("Finally");
        }
    }
}
