package com.ohgiraffers.chap13.level01.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : ");
            String[] input = scanner.nextLine().split(" ");
            // strontokenizer()
            String name = input[0];
            String number = input[1];
            if(name.equals("exit")) {
                break;
            }

            if(name.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String sname = scanner.nextLine();
                if(map.get(name) == sname) {
                    System.out.println(map.get(number));
                } else {
                    System.out.println(sname + "씨의 번호는 등록되어 있지 않습니다.");
                }
            }

            map.put(name, number);
            System.out.println("추가 완료 : " + map.get(name) + " " + map.get(number));
        }
    }
}
