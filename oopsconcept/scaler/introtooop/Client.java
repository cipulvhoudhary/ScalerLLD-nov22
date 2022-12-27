package com.oopsconcept.scaler.introtooop;

public class Client {

    public static void main(String[] args) {
        /**
         * Declaring a variable
         * [Data type] [Variable name] = [initial value]
         * int age = 24;
         */

        /**
         * Declaring an object
         *
         * Student vipul = new Student();
         */

        Student kartik = new Student();
        kartik.age = 25;
        Student naveen = new Student();
        naveen.age = 26;
        naveen.batch = "Nov 22 Advanced";
        naveen.changeBatch("Nov 21 Advanced");
    }

}
