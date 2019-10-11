package com.study.spring.entities;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    private String name = "Жучка";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
