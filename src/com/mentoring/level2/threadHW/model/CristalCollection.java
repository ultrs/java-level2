package com.mentoring.level2.threadHW.model;

public class CristalCollection {

    private final CristalColor cristalColor;
    private Integer cristalSize;

    public CristalCollection(CristalColor cristalColor) {
        this.cristalColor = cristalColor;
        this.cristalSize = 0;
    }

    public Integer getCristalSize() {
        return cristalSize;
    }

    public void addCristal(Integer addValue) {
        this.cristalSize += addValue;
    }
}
