package com.ohgiraffers.chap10.level01.basic;

import com.ohgiraffers.chap10.level01.basic.exception.DivideZero;
import com.ohgiraffers.chap10.level01.basic.exception.NotInteger;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        DivideTest divideTest = new DivideTest();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("분자 입력 : ");
            String num1 = scanner.nextLine();
            System.out.print("분모 입력 : ");
            String num2 = scanner.nextLine();

            divideTest.checkDivide(num1, num2);
            int number = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            System.out.println("결과 : " + number / number2);

        } catch (DivideZero e) {
            System.out.println(e.getMessage());
        } catch (NotInteger e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }
    }
}
