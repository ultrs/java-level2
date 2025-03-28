package com.mentoring.level2.threadHW.model;

import com.mentoring.level2.threadHW.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class CristalCollection {

    private List<CristalColor> cristalList;
    private int cristalSize;

    public CristalCollection() {
        cristalList = new ArrayList<CristalColor>();
        cristalSize = 0;
    }

    public int getCristalSize() {
        return cristalList.size();
    }

    public void addCristal() {
        cristalList.add(RandomUtil.getRandomCristalColor());
    }

    public void removeCristal(CristalColor color) {
        while (cristalList.contains(color)) {
            cristalList.remove(color);
        }
    }

    public void addCristalCollectionSize(int addSize){
        cristalSize += addSize;
    }
}
