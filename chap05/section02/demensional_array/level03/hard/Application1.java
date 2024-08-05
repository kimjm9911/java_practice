package com.ohgiraffers.chap05.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(i > 0 && i < 11 && j > 0 && j < 11 ) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            int i = scanner.nextInt();
            System.out.print("세로 행의 수를 입력하세요 : ");
            int j = scanner.nextInt();
            int[][] iarr = new int[i][j];
        } else {
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시입력하세요");
            System.out.print("가로 행의 수를 입력하세요 : ");
            int i = scanner.nextInt();
            System.out.print("세로 행의 수를 입력하세요 : ");
            int j = scanner.nextInt();
            int[][] iarr = new int[i][j];
        }
    }
}
