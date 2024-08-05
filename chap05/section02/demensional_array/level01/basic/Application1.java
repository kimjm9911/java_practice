package com.ohgiraffers.chap05.section02.demensional_array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[][] iarr = new int[3][4];
        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
        iarr[0][3] = 4;
        iarr[1][0] = 5;
        iarr[1][1] = 6;
        iarr[1][2] = 7;
        iarr[1][3] = 8;
        iarr[2][0] = 9;
        iarr[2][1] = 10;
        iarr[2][2] = 11;
        iarr[2][3] = 12;

        for(int i=0; i<iarr.length; i++) {
            for(int j=0; j<iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
