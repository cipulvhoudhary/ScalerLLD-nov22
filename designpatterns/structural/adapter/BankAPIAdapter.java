package com.designpatterns.structural.adapter;

public interface BankAPIAdapter {

    int checkBalance(String accountNumber);

    boolean sendMoney(String fromAccount, String toAccount, double amount);


}
