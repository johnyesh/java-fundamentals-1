package com.fundamentals.lessons;

/*
The contents of this class is for the Lesson 6 Slide Deck
Strings & More
* */
public class Lesson6 {

    String myString = "LaMars";

    // String method charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(4);
        System.out.println(myChar);
    } // end method

    // String method concatenation of two strings
    public void exampleConcat() {
        String result = myString.concat(" Donuts");
        System.out.println(result);
    } // end method

    // Method compares two strings to see if they are equal
    // Method compares using contains and equals
    public boolean exampleEquals() {
        boolean test = myString.toLowerCase().contains("mars");
        System.out.println(test);
        return myString.equals("mars");
    } // end method

    // Method takes a string and converts to lowercase
    public String exampleLowercase(String value) {
        return value.toLowerCase();
    } // end method

    // Method takes a string and coverts to uppercase
    public void exampleUppercase(String value) {
        System.out.println(value.toUpperCase());
    } // end method

    // Method determine the length of a string
    public int exampleLength() {
        return myString.length();
    } // end method

    // Example of how to use the StringBuilder class
    public void exampleBuilder(String food, int quantity) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ")
                .append(quantity).append(" plates of it.");
        String fav = builder.toString();
        System.out.println(fav);
    } // end method

    // 00A9
    // Method for showing the char data type
    public void exampleChar() {
        char c1 = 't'; // \u0074
        char c2 = '\u0074';
        //char c3 = '\u00A9';
        System.out.println(c1);
        System.out.println('\u00A9');
        System.out.println(c2);
    } // end method

    // Method shows escape sequences
    public void exampleEscape() {
        System.out.println("That\'s a \ncool game.\tCan I pla\by?");
    } // end method

} // end class
