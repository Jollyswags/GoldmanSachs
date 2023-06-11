package com.example.java.reflectionApi;

public class Bankingdetails {
    private String accountName;
    public String accountNumber;

    public Bankingdetails(){
        accountName="Swagata";
        accountNumber="123456789";
    }
    private void getAccountName(){
        System.out.println(accountName);
    }
    public void getAccountNumber(){
        System.out.println(accountNumber);
    }

    private void getDetails(){
        System.out.println(accountName+" "+accountNumber);
    }
}
