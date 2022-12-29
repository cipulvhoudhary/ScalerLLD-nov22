package com.designpatterns.behavioural.strategy.assignment;

import java.util.ArrayList;

public class BruteForceStrategy implements RainWaterTrappingSolution{

    @Override
    public int solve(int[] height) {
        System.out.println("Brute force solution :: TC --> O(N^2) || SC --> O(1)");
        return 0;
    }
}
