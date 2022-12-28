package com.designpatterns.behavioural.strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("This is the path from " + from + " to " + to + " by bike");
    }

}
