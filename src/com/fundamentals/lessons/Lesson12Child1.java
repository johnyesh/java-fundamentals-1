package com.fundamentals.lessons;

/*
* This is a child class of Lesson12
* */
public class Lesson12Child1 extends Lesson12 {

    private double radius;

    public Lesson12Child1(double radius) {
        super(0,0);
        this.radius = radius;
    } // end constructor

    @Override
    public double calculateArea() {
        System.out.println("Area of a circle");
        return Math.PI * (radius * radius);
    } // end method

    public double getRadius() {
        return radius;
    } // end method

} // end class
