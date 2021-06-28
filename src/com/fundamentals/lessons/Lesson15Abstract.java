package com.fundamentals.lessons;

/*
* This class shows content for Lesson 15
* Abstract & Interfaces
* */
public abstract class Lesson15Abstract {
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public Lesson15Abstract(int volume, int[] numberKeys, int sendKey,
                            String screen) {
        this.volume = volume;
        this.numberKeys = numberKeys;
        this.sendKey = sendKey;
        this.screen = screen;
    } // end constructor

    public abstract void receiveCall();

    public abstract void sendCall();

    public abstract void endCall();

    public int getVolume() { return volume; } // end method

    public int[] getNumberKeys() { return numberKeys; } // end method

    public int getSendKey() { return sendKey; } // end method

    public String getScreen() { return screen; } // end method

} // end class
