package com.fundamentals.exercises;

public class Lesson8Exercises {

    public static void main(String[] args) {
     // String mygrade =  gradeInfov2('A');
        loopExamplev2();
    }

    /*
    * Write a method that will take a char parameter
    * and a string return type. Using a switch and the
    * table below, return the description. If the case
    * does not match the char parameter, return the
    * message ‘Not a valid grade’.
    * */
    public String gradeInfo(char grade) {
        String description;
        switch (grade) {
            case 'E':
                description = "Excellant";
                break;
            case 'V':
                description = "Very Good";
                break;
            case 'G':
                description = "Good";
                break;
            case 'A':
                description = "Average";
                break;
            case 'F':
                description = "Failed";
                break;
            default:
                description = "Not a valid grade";
                break;
        }
        return description;
    } // end method

    public static String gradeInfov2(char grade) {
        switch (grade) {
            case 'E': return "Excellant";
            case 'V': return "Very Good";
            case 'G': return "Good";
            case 'A': return "Average";
            case 'F': return "Failed";
            default:  return "Not a valid grade";
        }
    } // end method

    /*
     Write a method that will take no parameters or
     return type. Using a loop, display all the numbers
     divisible by 3 from 0 to 30. Utilize a modulus to
     obtain your results.
    * */
    public static void loopExample() {
        int value = 0;
        while(value <= 30) {
            if(value % 3 == 0) {
                System.out.println(value);
            }
            value++;
        }
    } // end method

    public static void loopExamplev2() {
        for(int value = 0; value <= 10; value++) {
            //if(value % 3 == 0) {
                System.out.println(value * 3);
            //}
        }
    } // end method

} // end class
