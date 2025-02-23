package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public abstract class Body {

    private String name;
    private double mass;
    private double radius;
    private String atmosphere;

    public Body(String name, double mass, double radius, String atmosphere) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.atmosphere = atmosphere;
    }

}
