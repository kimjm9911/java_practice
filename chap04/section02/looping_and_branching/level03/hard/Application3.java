package com.ohgiraffers.chap04.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        int n = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print("문자 입력 : ");
                char ch = scanner.next().charAt(0);
                if(str.charAt(i) == ch) {
                    n += 1;

                } System.out.println("포함된 개수 : " + n + "개");
            }
        }
    }
}
