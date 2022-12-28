package com.designpatterns.behavioural.strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("This is the path from " + from + " to " + to + " by walk");
    }

}
