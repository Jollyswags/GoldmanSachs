package com.example.java.java15.sealedAccount;

public class Main {
    public static void main(String[] args) {
        Account obj=new CurrentAccount();
        obj.print();
        Account obj1=new SavingsAccount();
        obj1.print();
    }
}
