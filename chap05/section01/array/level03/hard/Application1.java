package com.ohgiraffers.chap05.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int n = scanner.nextInt();

        if(n % 2 != 0 && n > 0) {
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {

                System.out.println(arr[i] + " ");
            }
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }
}
