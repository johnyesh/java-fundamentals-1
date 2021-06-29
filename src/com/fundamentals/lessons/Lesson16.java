package com.fundamentals.lessons;

/*
* This class goes of the Lesson 16 content
* Enumerations
* */
public class Lesson16 {

    public enum IceCreamFlavors {VANILA, CHOCOLATE, STRAWBERRY, ROCK_ROAD}

    public void showEnum() {
        Lesson16Enum d1 = Lesson16Enum.WED;
        System.out.println(d1);
        d1.someEnumMethod();
        System.out.println(IceCreamFlavors.STRAWBERRY);
        System.out.println(Lesson16Enum.FRI);
    } // end method

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";
        switch (flavors) {
            case VANILA:
                message += "Vanilla"; // same as message = message + "Vanilla"
                break; // message = My favorite flavor is Vanilla
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case STRAWBERRY:
                message += "Strawberry";
                break;
            default:
                message += "Rocky Road";
                break;
        } // end switch
        System.out.println(message);
    } // end method

} // end class
