package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public abstract class Entity {
    private int countOfStars;
    private double size;

    public Entity(int countOfStars, double size) {
        this.countOfStars = countOfStars;
        this.size = size;
    }
}
