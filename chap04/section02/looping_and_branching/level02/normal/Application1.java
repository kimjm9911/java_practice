package com.ohgiraffers.chap04.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " + str.charAt(i));
        }
    }
}
