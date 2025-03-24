package com.mentoring.level2.threadHW.model;

import java.util.HashMap;
import java.util.Map;

import static com.mentoring.level2.threadHW.util.RandomUtil.getRandomCristalColor;
import static com.mentoring.level2.threadHW.util.RandomUtil.getRandomCristalSize;

public class Planet {

    private final String name;
    private CristalCollection planetCristalCollection;

    public Planet(String name) {
        this.name = name;
        planetCristalCollection = new CristalCollection();
    }

    public void newDayCristalGenerator(){
        for (int i = 0; i < getRandomCristalSize(); i++) {
            planetCristalCollection.addCristal();
        }
    }

    public boolean checkForClear(){
        return planetCristalCollection.getCristalSize() == 0 ? true : false;
    }

    public CristalCollection getPlanetCristalCollection() {
        return planetCristalCollection;
    }
}
