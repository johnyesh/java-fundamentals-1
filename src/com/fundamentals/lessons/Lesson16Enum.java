package com.fundamentals.lessons;

/*
* This demonstrates an Enum as part of Lesson 16
* */
public enum Lesson16Enum {
    SUN(2),MON(4),TUE(6),WED(8),THU(10),FRI(12),SAT(14);

    private int dayNum;

    private Lesson16Enum(int val) {
        dayNum = val;
       // System.out.println("Constructor called for " + this.toString());
    } // end constructor

    public int getDayNum() { return dayNum; } // end method

    public void someEnumMethod() {
        System.out.println("Method inside of enum");
    } // end method

} // end enum
