package com.ohgiraffers.chap04.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = scanner.nextInt();
        String str ="";

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                str = "박";
            } else {
                str = "수";
            }
            System.out.print(str);
        }
    }
}
