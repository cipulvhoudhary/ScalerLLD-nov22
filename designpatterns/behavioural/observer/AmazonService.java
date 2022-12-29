package com.designpatterns.behavioural.observer;

import java.util.ArrayList;

public class AmazonService {
    private static AmazonService instance;
    ArrayList<OrderPlacedEventSubscriber> orderPlacedEventSubscribers = new ArrayList<OrderPlacedEventSubscriber>();

    // Single object is required only
    public static AmazonService getInstance() {
        if(instance == null) {
            return new AmazonService();
        }
        return instance;
    }

    void registerSubscriber(OrderPlacedEventSubscriber orderPlacedEventSubscriber) {
        orderPlacedEventSubscribers.add(orderPlacedEventSubscriber);
    }
    void unregisterSubscriber(OrderPlacedEventSubscriber orderPlacedEventSubscriber) {
        orderPlacedEventSubscribers.remove(orderPlacedEventSubscriber);
    }

    void orderPlaced() {
        for(OrderPlacedEventSubscriber orderPlacedEventSubscriber : orderPlacedEventSubscribers) {
            orderPlacedEventSubscriber.onOrderPlaced();
        }
    }
}
