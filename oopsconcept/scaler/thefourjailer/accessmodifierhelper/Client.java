package com.oopsconcept.scaler.thefourjailer.accessmodifierhelper;

import com.oopsconcept.scaler.thefourjailer.accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        // here we can access public property only
        // protected can also be accesible iff, it is a child class
        st.age = 24;
        st.batch = "Nov - 22 Advanced";
    }
}
