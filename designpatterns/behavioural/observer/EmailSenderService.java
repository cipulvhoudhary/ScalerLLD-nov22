package com.designpatterns.behavioural.observer;

public class EmailSenderService implements OrderPlacedEventSubscriber {

    public EmailSenderService() {
        AmazonService amazonService = AmazonService.getInstance();
        amazonService.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Sending Email...");
    }

}
