package com.oopsconcept.scaler.thefourjailer.accessmodifierhelper;

import com.oopsconcept.scaler.thefourjailer.accessmodifiers.Student;

public class StudentChild extends Student {

    void doSomething() {
        age = 12;
        gender = "Male";
        batch = "DEC -22 ADVANCED";
        // name will not be visible, as default will not be visible in child class of different package
        // id will not be visible, as private is limited to same class
    }
    void doSomething2(Student st) {
        st.age = 24;
        st.batch = "DEC -22 ADVANCED";
        // Only public attribute is visible here,
        // because, if a child tries to access attributes from attributes of parent
        // via an object of it, they are considered a third party code.
    }
}
