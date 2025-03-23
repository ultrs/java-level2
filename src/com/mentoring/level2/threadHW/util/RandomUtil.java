package com.mentoring.level2.threadHW.util;


import com.mentoring.level2.threadHW.model.CristalColor;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getRandomCristalSize() {
        return RANDOM.nextInt(4) + 2;
    }

    public static CristalColor getRandomCristalColor() {
        if (RandomUtil.RANDOM.nextBoolean()) {
            return CristalColor.WHITE;
        } else {
            return CristalColor.RED;
        }
    }



    public static int getNextWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 1;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }
}
