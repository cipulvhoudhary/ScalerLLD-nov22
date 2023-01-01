package com.designpatterns.creational.prototype.student;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> registry = new HashMap<>();

    void register(String key, Student student) {
        registry.put(key, student);
    }

    Student get(String key) {
        return registry.get(key);
    }
}
