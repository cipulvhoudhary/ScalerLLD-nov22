package com.designpatterns.behavioural.observer;

public class InvoiceGenerator implements OrderPlacedEventSubscriber{

    public InvoiceGenerator() {
        AmazonService amazonService = AmazonService.getInstance();
        amazonService.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        generateInvoice();
    }

    public void generateInvoice() {
        System.out.println("Generating Invoice...");
    }
}
