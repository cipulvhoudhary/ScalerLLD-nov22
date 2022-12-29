package com.designpatterns.behavioural.strategy.googlemap;

public class PathCalculatorFactory {

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
