package com.ohgiraffers.chap04.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("체중을 입력하세요 : ");
        double weight = scanner.nextDouble();
        System.out.print("키를 입력하세요 : ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if(bmi >= 30) {
            System.out.println("당신은 비만입니다.");
        } else if(bmi >= 25) {
            System.out.println("당신은 과체중입니다.");
        } else if(bmi >= 20) {
            System.out.println("당신은 정상체중입니다.");
        } else {
            System.out.println("당신은 저체중입니다.");
        }

    }
}

