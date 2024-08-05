package com.ohgiraffers.chap06.level01.basic.student.run;

import com.ohgiraffers.chap06.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDTO students = new StudentDTO();
        String[] str = new String[10];

        int i = 0;

        label:
        while (i < 10) {
            System.out.print("학년: ");
            students.setGrade(scanner.nextInt());
            System.out.print("반 : ");
            students.setClassroom(scanner.nextInt());
            System.out.print("이름 : ");
            students.setName(scanner.next());
            System.out.print("국어점수 : ");
            students.setKor(scanner.nextInt());
            System.out.print("영어점수 : ");
            students.setEng(scanner.nextInt());
            System.out.print("수학점수 : ");
            students.setMath(scanner.nextInt());
            System.out.print("계속 추가할 겁니까? (y/n) : ");
            String answer = scanner.next();

            double avg = (students.getKor() + students.getEng() + students.getMath()) / 3;

            switch (answer) {
                case "y":
                case "Y":
                    i++;
                    break;
                case "n":
                case "N":
                    System.out.println(students.getInformation() +  ", 평균=" +avg);
                    break label;
                default: break label;
            }


        }

    }
}
