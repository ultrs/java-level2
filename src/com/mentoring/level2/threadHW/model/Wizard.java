package com.mentoring.level2.threadHW.model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Wizard {

    private final String name;
    private final CristalColor cristalColor;
    private CristalCollection wizardCristalCollection;

    public Wizard(String name, CristalColor cristalColor) {
        this.name = name;
        this.cristalColor = cristalColor;
        wizardCristalCollection = new CristalCollection();
    }

    public void getCristal(Planet planet) {
        if(planet.checkForClear()){
            System.out.println("На планете нет кристалов.");
        } else {
            int startSize = planet.getPlanetCristalCollection().getCristalSize();
            planet.getPlanetCristalCollection().removeCristal(cristalColor);
            wizardCristalCollection.addCristalCollectionSize(startSize - planet.getPlanetCristalCollection().getCristalSize());
        }
    }
}
