package com.designpatterns.structural.adapter;

public class PhonePe {

    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.checkBalance("accountNumber");
        Thread.sleep(25*24*60*60);
        return currentBalance * 3;
    }
}
