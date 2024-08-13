package com.ohgiraffers.chap13.level01.basic;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if(input.equals("exit")) { break; }
            if(input.equals("next")) {
                if(que.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    String name = que.poll();
                    System.out.println(name + " 고객님 차례입니다.");
                }
            } else {
                que.offer(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }

        }
    }
}
