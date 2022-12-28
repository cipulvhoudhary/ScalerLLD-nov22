package com.designpatterns.behavioural.strategy;

public class PublicTransportPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("This is the path from " + from + " to " + to + " by Public Transport");
    }

}
