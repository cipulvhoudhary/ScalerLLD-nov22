package com.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        PhonePe phonePe = new PhonePe(new ICICIBankAPIAdapter());

        System.out.println(phonePe.doSomething());
    }

}
