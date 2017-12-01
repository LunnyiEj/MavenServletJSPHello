package ru.lunnyiej;

public class cupOfTea {
    private int sipCount;

    public cupOfTea() {
        fillTheCup();
    }
    public int getSipCount() {
        return sipCount;
    }

    public void sip () {
        if (sipCount > 0) sipCount--;
    }

    public void fillTheCup () {
        sipCount = 5;
    }
}

