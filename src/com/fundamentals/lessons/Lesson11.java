package com.fundamentals.lessons;

/*
* The contents of this class is for lesson 11
* Constructors & Encapsulation
* */
public class Lesson11 {
    private String fName;
    private String lName;
    private String city;

    public Lesson11(String city) {
        this("John", "Doe", city);
    } // end constructor

    public Lesson11(String fName, String lName) {
        this(fName, lName, "Overland Park");
    } // end constructor

    public Lesson11(String fName, String lName, String city) {
        this.fName = fName;
        this.lName = lName;
        this.city = city;
    } // end constructor

    public String getfName() {
        return fName;
    } // end method

    public String getlName() {
        return lName;
    } // end method

    public String getCity() {
        return city;
    } // end method

} // end class
