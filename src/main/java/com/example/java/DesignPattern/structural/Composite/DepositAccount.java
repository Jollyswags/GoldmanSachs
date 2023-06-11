package com.example.java.DesignPattern.structural.Composite;

public class DepositAccount extends Component{
    private final String accountNo;
    private final float accountBalance;

    private AccountSatatement currentStmt;

    public DepositAccount(String accountNo, float accountBalance) {
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
