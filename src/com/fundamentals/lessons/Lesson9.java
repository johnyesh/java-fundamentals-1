package com.fundamentals.lessons;

/*
* The contents of this class is for Lesson 9
* Arrays
* */
public class Lesson9 {

    public void basicIntArray() {
        int[] intArray = {23,45,12,8,95,103,37};
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } // end for loop
    } // end method

    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "happy";
        stringArray[1] = "monday";
        stringArray[2] = "movie";
        stringArray[3] = "apple";

        System.out.println(stringArray[2]);

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end for loop
    } // end method

    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45} , {35, 46} , {57, 98}};
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println(myArray[i][j]);
            } // end inner loop
        } // end outer for loop
    } // end method

    public void basicThreeDimensionalArray() {
        int[][][] threeArray = new int[2][2][2];
        threeArray[0][0][0] = 10; // 1
        threeArray[0][1][0] = 12; // 3
        threeArray[0][0][1] = 13; // 2
        threeArray[0][1][1] = 14; // 4

        threeArray[1][0][0] = 15; // 5
        threeArray[1][1][0] = 16; // 7
        threeArray[1][1][1] = 17; // 8
        threeArray[1][0][1] = 18; // 6

        for(int able = 0; able < threeArray.length; able++) {
            for(int beta = 0; beta < threeArray[able].length; beta++) {
                for(int charlie = 0; charlie < threeArray[beta].length; charlie++) {
                    System.out.println(threeArray[able][beta][charlie]);
                } // end inner inner for loop
            } // end inner for loop
        } // end outer for loop

    } // end method

    public void basicJaggedArray() {
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "August";
        stringArray[0][2] = "July";

        for(int val = 0; val < stringArray.length; val++) {
            for(int met = 0; met < stringArray[val].length; met++) {
                System.out.println(stringArray[val][met]);
            } // end inner for loop
        } // end outter for loop
    } // end method

} // end class
