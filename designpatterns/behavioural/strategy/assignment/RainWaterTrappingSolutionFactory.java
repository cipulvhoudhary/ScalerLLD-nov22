package com.designpatterns.behavioural.strategy.assignment;

public class RainWaterTrappingSolutionFactory {

    public static RainWaterTrappingSolution getSolutionForType(String type) {
        if(type.equalsIgnoreCase("brute_force")) {
            return new BruteForceStrategy();
        }
        else if(type.equalsIgnoreCase("optimal1")) {
            return new Optimal1Strategy();
        }
        else {
            return new Optimal2Strategy();
        }
    }

}
