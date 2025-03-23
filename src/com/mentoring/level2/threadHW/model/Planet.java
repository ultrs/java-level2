package com.mentoring.level2.threadHW.model;

import java.util.HashMap;
import java.util.Map;

import static com.mentoring.level2.threadHW.util.RandomUtil.getRandomCristalColor;
import static com.mentoring.level2.threadHW.util.RandomUtil.getRandomCristalSize;

public class Planet {

    private final String name;
    private CristalCollection cristalCollection;

    public Planet(String name) {
        this.name = name;
        cristalValue = new HashMap<CristalColor, Integer>();
    }

    public void newDayCristalGenerator(){
        for (int i = 0; i < getRandomCristalSize(); i++) {
            cristalValue.put(getRandomCristalColor(), getRandomCristalSize());
        }
    }
}
