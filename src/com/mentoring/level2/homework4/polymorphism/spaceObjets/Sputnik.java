package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public class Sputnik extends Body{

    private Planet planet;
    public Sputnik(String name, double mass, double radius, String atmosphere, Planet planet) {
        super(name, mass, radius, atmosphere);
        this.planet = planet;
    }

}
