package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public class Planet extends Body{
    public Planet(String name, double mass, double radius, String atmosphere) {
        super(name, mass, radius, atmosphere);
    }

    @Override
    public double getDiameter() {
        return super.getDiameter();
    }

    @Override
    public boolean isMassMore(Body obj) {
        return super.isMassMore(obj);
    }
}