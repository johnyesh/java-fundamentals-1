package com.fundamentals.lessons;

/*
* This class goes over Lesson 14 content
* Static
* */
public class Lesson14 {
    public static final int MY_FIRST_FINAL = 2021;

    public static int myFirstStatic = 35;

    public static void myStaticMethodExample(int val) {
        System.out.println(MY_FIRST_FINAL * val);
    } // end method

    public static class MyInnerClass {
        public void myInnerMethod() {
            System.out.println(myFirstStatic);
        }
    } // end nested/inner class

} // end class
