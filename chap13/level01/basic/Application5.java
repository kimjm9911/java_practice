package com.ohgiraffers.chap13.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료) : ");
            String input = sc.nextLine();
            set.add(input);
            if(input.equals("exit")) {
                System.out.println("정렬된 단어 : " + set);
                break;
            }
        }
    }
}
