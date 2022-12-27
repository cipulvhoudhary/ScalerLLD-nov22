package com.designpatterns.structural.adapter;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private YesBankAPIAdapter yesBankAdapter = new YesBankAPIAdapter();

    @Override
    public int checkBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

}
