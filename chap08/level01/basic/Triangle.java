package com.ohgiraffers.chap08.level01.basic;

public class Triangle extends Shape implements Resizable{
    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    String name() {
        return "Triangle";
    }

    @Override
    public void resize(double factor) {
        this.base = (int) (factor * base);
        this.height = (int) (factor * height);
        this.side1 = (int) (factor * side1);
        this.side2 = (int) (factor * side2);
        this.side3 = (int) (factor * side3);
    }

    @Override
    double calculateArea() {
        return (double) (this.base * this.height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
