package com.fundamentals.lessons;

/*
* This class serves as a child class of Lesson15Abstract
* */
public class Lesson15Child extends Lesson15Abstract implements Lesson15Interface {

    public Lesson15Child(int volume, int[] numberKeys, int sendKey,
                         String screen) {
        super(volume, numberKeys, sendKey, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    } // end method

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    } // end method

    @Override
    public void endCall() {
        System.out.println("Call has ended");
    } // end method

    @Override
    public void holdCall() {
        System.out.println("Holding the call");
    } // end method
} // end class
