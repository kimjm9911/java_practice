package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();

        System.out.println(RandomMaker.randomNumber(1, 3));
        System.out.println(RandomMaker.randomUpperAlphabet(3));
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.println(RandomMaker.tossCoin());
    }
}
