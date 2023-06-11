package com.example.java.DesignPattern.structural.Composite;

public class SavingsAccount extends  Component{
    String accountNo;
    float accountBalance;

    private AccountSatatement currentStmt;

    public SavingsAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return accountBalance;
    }

    public AccountSatatement getStatement() {
        return currentStmt;
    }

}
