package com.fundamentals.lessons;

/*
* A second child of Lesson12
* */
public class Lesson12Child2 extends Lesson12 {

    private double val = .5f;

    public Lesson12Child2(int height, int width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of a type of triangle");
        return val * getWidth() * getHeight();
    }

    public void showMe() {
        System.out.println("Show me");
    }

} // end class
