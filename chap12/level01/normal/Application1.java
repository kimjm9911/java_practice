package com.ohgiraffers.chap12.level01.normal;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        Application1 app = new Application1();

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전 : " + Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
        app.swap(intArray, 1, 3);
        System.out.println("swap 후 : " + Arrays.toString(intArray));  // [1, 4, 3, 2, 5]

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전 : " + Arrays.toString(strArray));  // [A, B, C, D]
        app.swap(strArray, 0, 2);
        System.out.println("swap 후 : " + Arrays.toString(strArray));  // [C, B, A, D]
    }

    public <T> void swap(T[] Array, T index1, T index2) {
        T temp;
        temp = Array[(int) index1];
        Array[(int) index1] = Array[(int) index2];
        Array[(int) index2] = temp;
    }
}
