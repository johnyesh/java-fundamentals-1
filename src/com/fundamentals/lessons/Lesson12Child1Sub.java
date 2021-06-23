package com.fundamentals.lessons;

/*
* Sub/child class of Lesson12Child1
* */
public class Lesson12Child1Sub extends Lesson12Child1 {

    private double radiusMinor;

    public Lesson12Child1Sub(double radius, double radiusMinor) {
        super(radius);
        this.radiusMinor = radiusMinor;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of Ellipse");
        return Math.PI * getRadius() * radiusMinor;
    }

} // end class
