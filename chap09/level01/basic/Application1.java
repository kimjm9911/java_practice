package com.ohgiraffers.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace(words[i].substring(0,1), words[i].substring(0,1).toUpperCase());
            sb.append(words[i] + " ");
        }

        System.out.println("변환된 문자열 : " + sb);
        System.out.println("총 단어 개수: " + words.length);

    }
}
