package com.ohgiraffers.chap09.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] words = str.split(" ");

        int[] cnt = new int[words.length];


        if(str == "(\\^[a-zA-Z]\\$)\\+") {
        for(int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i] == words[j]) {
                    cnt[i]++;
                }
            }
        }
}

        System.out.println("===== 단어 빈도 =====");

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i] + ": " + cnt[i]);
        }
//        System.out.println("가장 빈도 높은 단어 : " + );
    }
}
