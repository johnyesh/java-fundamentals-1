package com.fundamentals.java;

import com.fundamentals.lessons.Lesson5;

public class Main {

    public static void main(String[] args) {
	 // lesson4Examples();
        lesson5Examples();
    }

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,12);
        int example = myLesson5.showLocalWithReturn(15, 8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversion();
    }

    public static void lesson4Examples() {
        // write your code here
        System.out.println("Welcome to Java");
        System.out.println("This is my first sentence");
        System.out.println("I am new to Java");
        System.out.println("This Java course is cool");
        System.out.println("I am learning stuff every day");

        House myHouse = new House();
        myHouse.doorOpenClose();

        // Single line comment
        /*
         Multi-line comment
         so I can use more words
         */
    }

}
