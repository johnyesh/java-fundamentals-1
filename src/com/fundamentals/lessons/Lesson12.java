package com.fundamentals.lessons;

/*
* This class demonstrates types of Inheritance
* Lesson 12 - Inheritance
* */
public class Lesson12 {

    private int height = 0;
    private int width = 0;


    public Lesson12(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        System.out.println("Area of a square, rectangle or parallelogram");
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
} // end class
