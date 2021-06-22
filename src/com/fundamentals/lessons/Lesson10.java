package com.fundamentals.lessons;

/* This contents of the class is for lesson 10
* Access Modifiers
* */
public class Lesson10 {

    // This method is only seen within the class
    private void showPrivateExample() {
        System.out.println("This is a private method");
    } // end method

    // This method is only seen within the package name
    void showDefaultExample() {
        System.out.println("This is a default modifier method");
    } // end method

    /* This method is seen within the package, and subclasses
    from another package */
    protected void showProtectedExample() {
        System.out.println("This is a protected modifier method");
    } // end method

    // This method is the most accessible
    public void showPublicExample() {
        System.out.println("This is a public modifier method");
        showPrivateExample();
    } // end method

} // end class
