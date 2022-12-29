package com.designpatterns.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        AmazonService amazonService = AmazonService.getInstance();
        EmailSenderService ems = new EmailSenderService();
        InvoiceGenerator ig = new InvoiceGenerator();
        AnalyticsSender as = new AnalyticsSender();

        amazonService.orderPlaced();
    }
}
