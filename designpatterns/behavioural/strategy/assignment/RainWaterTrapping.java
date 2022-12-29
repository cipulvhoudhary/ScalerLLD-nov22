package com.designpatterns.behavioural.strategy.assignment;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; // o/p : 6

        RainWaterTrappingSolution rwt = RainWaterTrappingSolutionFactory.getSolutionForType("OPTIMAL2");
        rwt.solve(height);
    }
}
