package com.mentoring.level2.threadHW.model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Wizard {

    private final String name;
    private CristalCollection cristalCollection;

    public Wizard(String name, CristalCollection cristalCollection) {
        this.name = name;
        this.cristalCollection = cristalCollection;
    }
}
