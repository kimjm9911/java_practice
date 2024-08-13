package com.ohgiraffers.chap10.level02.basic;

import com.ohgiraffers.chap10.level02.basic.exception.NegativeDate;
import com.ohgiraffers.chap10.level02.basic.exception.NotTwenty;

import java.util.Date;

public class InvalidAgeException {
    public void checkAge(Date birthDate)
            throws NotTwenty, NegativeDate {
        int age = birthDate.compareTo(new Date());

        if(age < 20) {
            System.out.println("만 20세 미만은 입장 불가입니다.");
        }

//        if(birthDate != "yyyy-mm-dd") {
//            System.out.println("날짜 형식을 잘못 입력하셨습니다.");
//        }
    }
}
