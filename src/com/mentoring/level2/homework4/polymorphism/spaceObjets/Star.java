package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public class Star extends Body{

    private int age;
    private Planet[] planet;
    public Star(String name, double mass, double radius, String atmosphere, int age) {
        super(name, mass, radius, atmosphere);
        this.age = age;
    }
}
