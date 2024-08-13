package com.ohgiraffers.chap08.level01.basic;

public class Circle extends Shape implements Resizable{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    String name() {
        return "Circle";
    }

    @Override
    public void resize(double factor) {
        this.radius = (int) (this.radius * factor);
    }
}
