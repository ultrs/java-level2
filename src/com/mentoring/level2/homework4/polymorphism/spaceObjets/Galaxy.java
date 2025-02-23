package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public class Galaxy extends Entity{
    private System[] systems;

    public Galaxy(int countOfStars, double size, System[] systems) {
        super(countOfStars, size);
        this.systems = systems;
    }
}
