package com.oopsconcept.constructorchaining;

public class C extends B{

    public C() {
        super(5);
        System.out.println("C constructor");
    }
    public C(String something) {
        super(5);
        System.out.println(something);
    }
}
