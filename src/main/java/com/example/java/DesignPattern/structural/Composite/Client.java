package com.example.java.DesignPattern.structural.Composite;

public class Client {
    public static void main(String[] args) {
        Component component = new CompositeAccount();
        SBI sbi=new SBI();
        sbi.add(new DepositAccount("DA001", 100));
        sbi.add(new DepositAccount("DA002", 150));
        sbi.add(new SavingsAccount("SA001", 200));
        component.add(sbi);

        ICICI icici=new ICICI();
        icici.add(new DepositAccount("DA001", 1300));
        icici.add(new DepositAccount("DA002", 1400));
        icici.add(new SavingsAccount("SA001", 1500));

        component.add(icici);

        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);

        //AccountSatatement mergedStatement = component.getStatement();
    }
}
/*
"allow clients to operate
in generic manner on objects that may or may not represent a hierarchy of objects".
 */