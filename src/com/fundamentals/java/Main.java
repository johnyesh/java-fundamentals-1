package com.fundamentals.java;

import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson6;
import com.fundamentals.lessons.Lesson7;
import com.fundamentals.lessons.Lesson8;

public class Main {

    public static void main(String[] args) {
	   // lesson4Examples();
       // lesson5Examples();
       // lesson6Examples();
       // lesson7Examples();
       // lesson8Examples();
       // moreLesson8();
        song();
    }

    public static void song() {
        BottlesOfBeerSong bob = new BottlesOfBeerSong();
        bob.timeToSing();
    }

    public static void moreLesson8() {
        Lesson8 myEight = new Lesson8();
        myEight.basicWhileExample();
        myEight.basicDoWhileExample();
        myEight.basicForLopp();
        myEight.basicBranchingExample();
    } // end method

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10);
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(10, 12);
        myLesson8.basicIfElseExample(12, 12);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(102);
        myLesson8.basicSwitchExample(3);
    } // end method

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.exampleArithmatic();
        //myLesson7.addTwoNumbers(); // uncomment to test
        myLesson7.exampleAssignment();
        myLesson7.exampleAnd();
        myLesson7.exampleOr();
        myLesson7.exampleXor();
        myLesson7.exampleLeftShift();
        myLesson7.exampleRightShift();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    } // end method

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat();
        boolean val = myLesson6.exampleEquals();
        System.out.println(val);
        String str1 =  myLesson6.exampleLowercase("HAPPY");
        myLesson6.exampleUppercase("example");
        System.out.println(myLesson6.exampleLength());
        myLesson6.exampleBuilder("Spaghetti", 2);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // end method

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
