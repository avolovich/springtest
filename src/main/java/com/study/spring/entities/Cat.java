package com.study.spring.entities;

import org.springframework.stereotype.Component;

@Component("barsik")
public class Cat {
    private String name = "Барсик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
