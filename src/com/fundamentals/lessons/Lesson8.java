package com.fundamentals.lessons;

/*
* The contents of this class is to go over Lesson 8 Content
* Control Flow Statements
* */
public class Lesson8 {

    public void basicIfExample(int value1, int value2) {
        System.out.println("Before if Statement");
        if(value1 == value2) {
            System.out.println("Values are equal");
        } // end if
        System.out.println("After if Statement");
    } // end method

    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if(alpha != beta) {
          System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if/else
        System.out.println("After if/else statement");
    } // end method

    public void basicIfElseChainExample(int charlie) {
        System.out.println("Before if Statement");
        if(charlie < 30) {
            System.out.println("The value is less than 30");
        } else if(charlie < 40) {
            System.out.println("The value is greater than 30 but " +
                    "less than 40");
        } else {
            System.out.println("The value is greater than 40");
        } // end if/elseif/else
        System.out.println("End of if statement");
    } // end method

    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if statements");
        if(delta > 100 || delta < 50) {
            System.out.println("The value is not between 100 & 50");
        } // end if
        if(delta % 2 == 0 && delta > 30) {
            System.out.println("The value is greater than 30 and an" +
                    " even number");
        } // end if
        System.out.println("After if statements");
    } // end method

    public void basicSwitchExample(int value1) {
        switch (value1) {
            case 1: // same as if(value == 1)
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
            case 4: //same as if(value == 3 || value == 4)
                System.out.println("value is 3 or 4");
                break;
            default: // same as else { }
                System.out.println("The value is greater than 4");
                break;
        } // end switch
    } // end method

    public void basicWhileExample() {
        int val = 0; // initilized value
        while(val < 10) { //expression
            System.out.println(val);
            val++; // increment
        } // end while loop
    } // end method

    public void basicDoWhileExample() {
        int echo = 0;
        do {
            if (echo % 2 == 0) {
                System.out.println(echo);
            } // end if
            echo++;
        } // end do
        while(echo < 30);
    } // end method

    public void basicForLopp() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        } // end for loop
    } // end method

    public void basicBranchingExample() {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            } // end if
            if(i == 4) {
                System.out.println("Loop Breaks");
                break;
            } // end if
            System.out.println(i);
        } // end for loop
        System.out.println("End of loop");
    } // end method

} // end class
