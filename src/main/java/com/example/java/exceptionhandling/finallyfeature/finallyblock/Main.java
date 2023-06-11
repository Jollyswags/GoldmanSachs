package com.example.java.exceptionhandling.finallyfeature.finallyblock;

public class Main {
    public static void main(String[] args) {
        Main obj=new Main();
        obj.dividebyzero(2,0);
    }
    public void dividebyzero(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
