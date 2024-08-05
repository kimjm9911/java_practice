package com.ohgiraffers.chap04.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합 : " + sum);
    }
}
