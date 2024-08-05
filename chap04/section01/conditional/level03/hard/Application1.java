package com.ohgiraffers.chap04.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int firstNum = scanner.nextInt();
        System.out.print("두번째 정수 : ");
        int secondNum = scanner.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char op = scanner.next().charAt(0);

        int result = 0;
        switch(op) {
            case '+' :
                result = firstNum + secondNum;
                System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
                break;
            case '-' :
                result = firstNum - secondNum;
                System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
                break;
            case '*' :
                result = firstNum * secondNum;
                System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
                break;
            case '/' :
                result = firstNum / secondNum;
                System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
                break;
            case '%' :
                result = firstNum % secondNum;
                System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                break;
        }
    }
}
