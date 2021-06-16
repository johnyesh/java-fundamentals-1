package com.fundamentals.lessons;

import java.util.Scanner;

/*
* The contents of the class goes over Lesson7 Content
* Java Operators
* */
public class Lesson7 {

    int value1 = 23, value2 = 45;

    public void exampleArithmatic() {
        int addTotal = value1 + value2;
        int subtractTotal = value2 - value1;
        int multiplyTotal = value1 * value2;
        int divideTotal = value1 / value2;
        int modulusTotal = value1 % value2;
        System.out.println(addTotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotal);
        System.out.println(divideTotal);
        System.out.println(modulusTotal);
    } // end method

    public void addTwoNumbers() {
        int able, beta, charlie;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        able = in.nextInt();
        beta = in.nextInt();
        charlie = able + beta;
        System.out.println("The sum of entered values = " + charlie);
    } // end method

    public void exampleAssignment() {
        value1 += value2;
        System.out.println(value1);
        value2 -= value1;
        System.out.println(value2);
        value1 *= value2;
        System.out.println(value1);
        value1 /= value2;
        System.out.println(value1);
        value1 %= value2;
        System.out.println(value1);
    } // end method

    /*
    * The AND bitwise operator compares the binary of 2 numbers
    * Only the matched set of 1's carry over to the answer
    * */
    public void exampleAnd() {
        // The number 10 in binary is 1010
        // The number 2 in binary is 0010
        int result = 10 & 2;
        System.out.println(result); // answer is 2
    } // end method

    /*
    * The OR bitwise operator compares the binary of 2 numbers
    * Only one of the binaries need to be a 1 to carry over.
    * If both are 1, it also carries over to the answer.
    * */
    public void exampleOr() {
        // The number 15 in binary is 1111
        // The number 30 in binary is 0001 1110
        int result = 15 | 30;
        System.out.println(result); // answer is 31 0001 1111
    } // end method

    /*
    * The XOR bitwise operator compares the binary of 2 numbers
    * If the bits vary when compared, a 1 takes its place.
    * */
    public void exampleXor() {
        // The value of 15 in binary is 1111
        // The value of 30 in binary is 0001 1110
        int result = 15 ^ 30;
        System.out.println(result); // answer is 17 0001 1110
    }

    /*
    * The shift left operator will take the value as a primitive
    * type and convert it to binary. The right side value will shift
    * its binary bits of the number to the left by the number of spaces.
    * The high-order bits outside the range of the result type of x are
    * discarded. The remaining bits are shifted left, and the lower-order
    * empty bit positions are set to 0.
    * */
    public void exampleLeftShift() {
        // The number 15 in binary is 1111
        // Shifting value by 2 results in 0011 1100 which is 60
        int result = 15 << 2;
        System.out.println(result);
    } // end method

    /*
    * The right shift bitwise operator will tak the value as a
    * primitive type and convert it to the binary version. The
    * right side value will shift the binary bits of the number
    * to the right by the number of spaces. When the value is of type
    * int or long, the lower-order bits are discarded. The remaining
    *  bits are shifted right, and the high-order empty bit positions
    * are set to zero.
    * */
    public void exampleRightShift() {
        // The number 30 in binary is 0001 1110
        // Shifting the value by 2 results in 0111 or 7
        int result = 30 >> 2;
        System.out.println(result);
    } // end method

    public void exampleRelational() {
        int echo = 25, foxtrot = 30, golf = 25;
        boolean result1 = echo == foxtrot;
        System.out.println(result1);
        boolean result2 = echo != foxtrot; // !=
        System.out.println(result2);
        boolean result3 = foxtrot > golf;
        System.out.println(result3);
        boolean result4 = foxtrot < golf;
        System.out.println(result4);
        boolean result5 = echo >= golf;
        System.out.println(result5);
        boolean result6 = foxtrot <= echo;
        System.out.println(result6);
    } // end method

    public void exampleIncrement() {
        int home = 10, jump, car;
        jump = home++; //post increment
        System.out.println(jump); // answer should 10
        // home = 11
        car = ++home; // pre increment
        System.out.println(car); // answer should 12
    } // end method

    public void exampleDecrement() {
        int able = 10, beta, delta;
        beta = able--;
        System.out.println(beta); // answer 10
         // able = 9
        delta = --able;
        System.out.println(delta); // answer 8
    } // end method

} // end class
