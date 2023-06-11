package com.example.java.java15.sealedAccount;

public sealed class Account permits CurrentAccount, SavingsAccount{
    public void print(){
        System.out.println("Account");
    }

}
