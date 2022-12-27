package com.designpatterns.structural.decorator.icecream;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new ChocoScoop(
                new VanillaScoop(
                        new BlueberryScoop(
                                new ChocoSyrup(
                                        new VanillaCone(
                                                new ChocoSyrup(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
                )
        );

        System.out.println(iceCream.getCost());
        System.out.println((iceCream.getDescription()) + "Enjoy!!!");
    }
}
