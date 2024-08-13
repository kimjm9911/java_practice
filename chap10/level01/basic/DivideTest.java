package com.ohgiraffers.chap10.level01.basic;

import com.ohgiraffers.chap10.level01.basic.exception.DivideZero;
import com.ohgiraffers.chap10.level01.basic.exception.NotInteger;

public class DivideTest {
    public void checkDivide(String num1, String num2)
            throws DivideZero, NotInteger {

        String regx = "^[0-9]+";

        if (num2 == "0") {
            throw new DivideZero("오류 : 0으로 나눈 것은 허용되지 않습니다.");
        }
        /* 아스키 코드 48 ~ 57이 숫자 */
        if (!num1.matches(regx) || !num2.matches(regx)) {
            throw new NotInteger("오류 : 유효한 정수를 입력하세요.");
        }
    }
}

