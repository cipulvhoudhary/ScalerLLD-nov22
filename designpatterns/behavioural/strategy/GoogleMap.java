package com.designpatterns.behavioural.strategy;

import java.util.Scanner;

public class GoogleMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mode: ");
        String mode = sc.nextLine();

//
//        if(mode.equalsIgnoreCase("car")) {
//
//        }
//        else if(mode.equalsIgnoreCase("Bike")) {
//
//        } --> violates SRP & OCP

        // Strategy & Factory
        PathCalculatorStrategy pcs = PathCalculatorFactory.getPathFromMode(mode);
        pcs.findPath("A", "B");
    }
}
