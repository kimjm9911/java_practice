package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }

    public static String randomUpperAlphabet(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (rand.nextInt(26) + 65));
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        String rps [] = {"가위", "바위", "보"};
        int num = (int)(Math.random() * (rps.length - 1));

        return rps[num];
    }

    public static String tossCoin() {
        String tc [] = {"앞면", "뒷면"};
        int num = (int)(Math.random() * (tc.length - 1));

        return tc[num];
    }
}
