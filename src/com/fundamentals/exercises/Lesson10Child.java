package com.fundamentals.exercises;

import com.fundamentals.lessons.Lesson10;

public class Lesson10Child extends Lesson10 {

    public void myMethod() {
        showProtectedExample();
    }

    /*
    * Order of Access from Most Restricted to less
    * 1. private
    * 2. default
    * 3. protected
    * 4. public
    * */

}
