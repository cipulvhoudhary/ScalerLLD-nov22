package com.designpatterns.creational.builder.version1;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "vipul");
        map.put("email", "xyz@gmail.com");
        map.put("phone", 953428);
        map.put("batch", "academy");
        map.put("psp", 95.50);

        Student st1 = new Student(map);
        System.out.println(st1.toString());
    }
}
