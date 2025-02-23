package com.mentoring.level2.homework4.polymorphism.spaceObjets;

public class System extends Entity {
    private Star star;
    public System(int countOfStars, double size, Star star ) {
        super(countOfStars, size);
        this.star = star;
    }

}
