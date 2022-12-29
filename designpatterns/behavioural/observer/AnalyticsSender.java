package com.designpatterns.behavioural.observer;

public class AnalyticsSender implements OrderPlacedEventSubscriber, OrderCancelledEventSubscriber{

    public AnalyticsSender() {
        AmazonService amazonService = AmazonService.getInstance();
        amazonService.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Updating analytics");
    }

    @Override
    public void onOrderCancelled() {
    }

}
