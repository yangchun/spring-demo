package com.baidu.annotation;

public class Student {
    private String name;

    @Log(logger = "testLogger")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
