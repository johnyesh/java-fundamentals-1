package com.fundamentals.lessons;

import com.fundamentals.java.House;

/*
* This class goes over the Lesson 18 content
* Exception Handling
* */
public class Lesson18 {
    House ranch;

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());
    } // end method

    public void exampleException1() {
        int[] values = {2,4,6};
        try {
            System.out.println(values[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index Out of bounds = " + ex.getMessage());
        }
    } // end method

    public void exampleException2() {
        House[] names = {new House(), new House(), ranch};
        try {
            System.out.println(names[3].getWindowSize());
        } catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Array out of bounds - " + ex.getMessage());
        } catch (NullPointerException ax) {
           System.out.println("Null pointer - " + ax.getMessage());
        }
    } // end method

    public void exampleFinally() {
        try {
            //System.out.println("House");
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException ex) {
            System.out.println("Null pointer - " + ex.getMessage());
        } finally {
            System.out.println("Ranch finally block called");
        }
    } // end method

    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Jody"};
        String[] values = {"2433", "423", "130" };
        try {
            byte b = Byte.parseByte(values[1]);
            //int b = 5 / 0;
            System.out.println(b);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch (NumberFormatException ed) {
            System.out.println("That is not a number - " + ed.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("You have given me more than a byte");
        } catch (Exception ea) { //
            System.out.println("I dunno what you did - " + ea.getMessage());
        } // end try / catch / catch / catch / catch

    } // end method
} // end class
