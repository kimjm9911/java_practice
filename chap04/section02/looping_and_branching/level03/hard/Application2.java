package com.ohgiraffers.chap04.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Random random = new Random();
        int r = random.nextInt() * 11 - 1;
        for(int i = 1; r == n; i++) {
            System.out.print("정수를 입력하세요 : ");
            if(n > r) {
                System.out.println("입력하신 정수보다 작습니다.");
                break;
            } else if (n < r) {
                System.out.println("입력하신 정수보다 큽니다.");
                break;
            } else {
                System.out.println(i + "회만에 정답을 맞추셨습니다.");
            }
        }
    }
}
