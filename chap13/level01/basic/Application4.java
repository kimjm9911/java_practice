package com.ohgiraffers.chap13.level01.basic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료) : ");
            String id = sc.nextLine();
            if(id.equals("exit")) {
                System.out.println("모든 학생의 ID : " + set);
                break;
            }
            boolean sid = set.add(id);
            if(sid) {
                System.out.println("ID가 추가 되었습니다.");
            } else {
                System.out.println("이미 등록된 ID입니다.");
            }
        }
    }
}
