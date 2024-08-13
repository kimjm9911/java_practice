package com.ohgiraffers.chap13.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        double avg = 0.0;
        double sum = 0.0;

        LinkedList<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("학생 성적 : ");
            int score = scanner.nextInt();
            list.add(score);
            System.out.print("추가 입력하려면 y : ");
            char input = scanner.next().charAt(0);
            if(input == 'n' || input == 'N') break;
        }

        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avg = sum / list.size();
        System.out.println("학생 인원 : " + list.size());
        System.out.println("평균 점수 : " + avg);

    }
}
