package com.ohgiraffers.chap04.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int n = scanner.nextInt();

        if(n > 2) {
            for(int i = 1; i <= n; i++) {
                if (n / i == 1 && n % i == 0) {
                    System.out.println(i + ", " + n);
                    System.out.println("소수다.");
                } else {
                    System.out.println("소수가 아니다.");
                }
            }
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }
    }
}
