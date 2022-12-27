package com.designpatterns.structural.adapter;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankAPIAdapter iciciBankAdapter = new ICICIBankAPIAdapter();

    @Override
    public int checkBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

}
