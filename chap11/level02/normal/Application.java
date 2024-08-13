package com.ohgiraffers.chap11.level02.normal;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int n = scanner.nextInt();

        String[] txt1 = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.print((i+1) + " 번째 파일 이름 입력 : ");
            txt1[i] = scanner.next();
        }

        System.out.print("병합될 파일 명 입력 : ");
        String txt2 = scanner.next();

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            bw = new BufferedWriter(new FileWriter(txt2));
            for(int i = 0; i<n; i++) {
                br = new BufferedReader(new FileReader(txt1[i]));
                String temp;
                while((temp = br.readLine()) != null) {
                    bw.write(temp);
                }
                bw.flush();
            }

            System.out.println("파일 병합이 완료 되었습니다.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                    bw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}