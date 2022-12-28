package com.designpatterns.behavioural.strategy;

public class PathCalculatorFactory {
    
    // This does not violates srp and ocp, as factory is a part of business logic
    public static PathCalculatorStrategy getPathFromMode(String mode) {
        if(mode.equalsIgnoreCase("Car")) {
            return new CarPathCalculatorStrategy();
        }
        else if(mode.equalsIgnoreCase("Bike")) {
            return new BikePathCalculatorStrategy();
        }
        else if(mode.equalsIgnoreCase("Walk")) {
            return new WalkPathCalculatorStrategy();
        }
        else {
            return new PublicTransportPathCalculatorStrategy();
        }
    }
}
