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

//    public static String rockPaperScissors() {
//        Random R = new Random();
//
//    }
//
//    public static String tossCoin() {
//
//    }
}
