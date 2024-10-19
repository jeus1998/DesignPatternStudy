package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory;
public class Ship {
    private String name;
    private String color;
    private Wheel wheel;
    private Anchor anchor;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Wheel getWheel() {
        return wheel;
    }
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public Anchor getAnchor() {
        return anchor;
    }
    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
