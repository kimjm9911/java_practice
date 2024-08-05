package com.ohgiraffers.chap06.level02.noraml.book.run;

import com.ohgiraffers.chap06.level02.noraml.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookdto = new BookDTO();
        bookdto.printInformation();

        BookDTO bookdto2 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0,0.0);
        bookdto2.printInformation();

        BookDTO bookdto3 = new BookDTO("홍길동전", "활빈당","허균", 5000000, 0.5);
        bookdto3.printInformation();
    }
}
