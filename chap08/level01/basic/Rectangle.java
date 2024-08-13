package com.ohgiraffers.chap08.level01.basic;

public class Rectangle extends Shape implements Resizable{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String name() {
        return "Rectangle";
    }

    @Override
    public void resize(double factor) {
        this.width = (int) (factor * this.width);
        this.height = (int) (factor * this.height);
    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }
}
