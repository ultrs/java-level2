package com.mentoring.level2.threadHW.util;


import com.mentoring.level2.threadHW.model.CristalColor;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int BOUND = 4;
    private static final int BOUND_CORRECTION = 2;

    private RandomUtil() {
    }

    public static int getRandomCristalSize() {
        return RANDOM.nextInt(BOUND) + BOUND_CORRECTION;
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
