package com.fundamentals.java;

public class House {

    private String foundationType;
    private String roofStyle;
    private int windowSize;
    private String doorColor;

    // Default Constructor
    public House() {
        this("Red","bamboo", "plastic", 30);
        System.out.println("This is the default constructor");
    } // end constructor

    // Constructor with 1 parameter
    public House(String doorColor) {
        this(doorColor,"Shingle", "dirt", 24);
        System.out.println("The door color is " + doorColor);
    } // end constructor

    public House(String colorDoor, String styleRoof,
                 String typeFoundation, int sizeWindow) {
        doorColor = colorDoor;
        roofStyle = styleRoof;
        foundationType = typeFoundation;
        windowSize = sizeWindow;
    } // end constructor

    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    } // end method

    public String getFoundationType() {
        return this.foundationType;
    } // end method

    public void setRoofStyle(String roofStyle) {
        this.roofStyle = roofStyle;
    } // end method

    public String getRoofStyle() {
        return roofStyle;
    } // end method

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    } // end method

    public int getWindowSize() {
        return windowSize;
    } // end method

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    } // end method

    public String getDoorColor() {
        return doorColor;
    } // end method

    public void doorOpenClose() {
        System.out.println("The door is open");
    } // end method

    public void doorOpenClose(String status) {
        System.out.println("The door is " + status);
    } // end method

} // end class
