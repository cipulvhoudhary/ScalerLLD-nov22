package com.designpatterns.creational.prototype.classmatecasestudy;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    private Map<String, Notebook> registry = new HashMap<>();

    void register(String key, Notebook notebook) {
        registry.put(key, notebook);
    }

    Notebook getNotebook(String key) {
        return registry.get(key);
    }
}
