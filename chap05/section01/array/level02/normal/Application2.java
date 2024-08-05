package com.ohgiraffers.chap05.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        for(int i=8; i<chars.length; i++) {
            chars[i] = '*';
        }
        for(int i=0; i<chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
