package com.mentoring.level2.homework4.polymorphism.util;

import com.mentoring.level2.homework4.polymorphism.spaceObjets.Body;

public interface SpaceUtils {

    int GRAVITY_CONSTANT = 3;
    static double getGravityForce(Body obj1, Body obj2) {
        return (GRAVITY_CONSTANT * obj1.getMass() * obj2.getMass())/(obj1.getRadius() * obj2.getRadius());
    }

    double getMass();
    double getRadius();
}
