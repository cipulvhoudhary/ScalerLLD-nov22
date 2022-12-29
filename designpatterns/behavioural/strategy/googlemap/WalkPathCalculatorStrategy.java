package com.designpatterns.behavioural.strategy.googlemap;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("This is the path from " + from + " to " + to + " by walk");
    }

}
