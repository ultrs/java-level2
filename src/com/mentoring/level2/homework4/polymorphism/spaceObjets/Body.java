package com.mentoring.level2.homework4.polymorphism.spaceObjets;

import com.mentoring.level2.homework4.polymorphism.util.SpaceUtils;

public abstract class Body implements SpaceUtils {

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

     public double getDiameter(){
        return radius * 2;
     }

     public boolean isMassMore(Body obj){
        return mass > obj.getMass();
     }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", atmosphere='" + atmosphere + '\'' +
                '}';
    }

    public double getMass() {
        return mass;
    }
}
