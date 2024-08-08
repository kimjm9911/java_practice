package com.ohgiraffers.chap10.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String str1 = scanner.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String str2 = scanner.nextLine();

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(str1);
            fw = new FileWriter(str2);

            int value;
            while ((value = fr.read()) != -1) {
                fw.write((char)value);
            }

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + str1 + " (지정된 파일을 찾을 수 없습니다.)");
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
