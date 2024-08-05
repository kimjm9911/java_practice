package com.ohgiraffers.chap04.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = scanner.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = scanner.nextInt();
        double bonus = 0;

        if(sales>= 50000000) {
            bonus = 0.05;
        } else if(sales>= 30000000) {
            bonus = 0.03;
        } else if(sales>= 10000000) {
            bonus = 0.01;
        }

        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + (int)(bonus * 100) + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int)(sales * bonus));
        System.out.println("======================");
        System.out.println("총 급여 : " + (salary + (int)(sales * bonus)));
    }
}
