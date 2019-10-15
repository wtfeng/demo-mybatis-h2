package com.example.demo.model;

public class City {
    String name;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
