package com.example.java.exceptionhandling.finallyfeature.thrownew;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        Main obj=new Main();
        obj.dividebyzero(9,0);

    }
    public void dividebyzero(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            throw new ArithmeticException("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
