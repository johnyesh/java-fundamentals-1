package com.fundamentals.java;

import com.fundamentals.lessons.*;

public class Main {

    public static void main(String[] args) {
	   // lesson4Examples();
       // lesson5Examples();
       // lesson6Examples();
       // lesson7Examples();
       // lesson8Examples();
       // moreLesson8();
        //song();
        //lesson9Examples();
        //lesson10Examples();
        //houseConstructorExample();
       // lesson11Examples();
       // condoExample();
        lesson12Examples();
    }

    // also uses lesson 13
    public static void lesson12Examples() {
        Lesson12Child1 child1 = new Lesson12Child1(5);
        System.out.println(child1.calculateArea());
        System.out.println("h " + child1.getHeight());

        Lesson12 myLesson12 = new Lesson12Child2(5, 10);
        System.out.println(myLesson12.calculateArea());

        Lesson12 my12 = new Lesson12Child1(5);
        System.out.println(my12.calculateArea());

    } // end method

    public static void condoExample() {
        Condo myCondo = new Condo();
        myCondo.setBalcony("Small");
        myCondo.doorOpenClose(); // from Condo class override
        myCondo.doorOpenClose("closed"); // from House class
        myCondo.setDoorColor("blue"); // from House class
        myCondo.maintenance();
    } // end method

    public static void lesson11Examples() {
        Lesson11 myEleven = new Lesson11("Kansas City");
        System.out.println(myEleven.getfName() + " " +
                myEleven.getlName() + " is from " + myEleven.getCity());
    }

    public static void houseConstructorExample() {
        House house1 = new House();
        house1.setDoorColor("Green");
        System.out.println(house1.getDoorColor());

        House house2 = new House("red");
        //System.out.println(house2.getFoundationType()); // prints null

        House house3 = new House("blue","metal",
                "bamboo",32);
        System.out.println(house3.getRoofStyle());
    } // end method

    public static void lesson10Examples() {
        Lesson10 myTen = new Lesson10();
        myTen.showPublicExample();

        Lesson10Demo myTenDemo = new Lesson10Demo();
        myTenDemo.showOtherModifiers();
    }

    public static void lesson9Examples() {
        Lesson9 myNine = new Lesson9();
        myNine.basicIntArray();
        myNine.basicStringArray();
        myNine.basicTwoDimensionalArray();
        myNine.basicThreeDimensionalArray();
        myNine.basicJaggedArray();
    } // end method

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
