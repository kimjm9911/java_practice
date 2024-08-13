package com.ohgiraffers.chap11.level01.basic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        FileReader fr = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("파일의 이름을 입력하세요 : ");
        String str = sc.nextLine();

        try {
            fr = new FileReader(str);

            int value;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }

        } catch (IOException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
