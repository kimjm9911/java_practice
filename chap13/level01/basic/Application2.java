package com.ohgiraffers.chap13.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = scanner.nextLine();
            if(url.equals("exit")){ break; }
            list.addFirst(url);

            if(list.size() > 5 ) {
                list.removeLast();
            }

            System.out.println("최근 방문 url : " + list);
        }

    }
}
