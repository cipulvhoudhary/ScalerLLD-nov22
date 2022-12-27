package com.oopsconcept.scaler.constructors;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.age);
        System.out.println(st.name);
        System.out.println(st.gender);

        StudentA stA = new StudentA();
        System.out.println(stA.age);
        System.out.println(stA.name);
        System.out.println(stA.gender);

        StudentB stB = new StudentB("vipul", "Male");
        System.out.println(stB.age);
        System.out.println(stB.name);
        System.out.println(stB.gender);
    }
}
