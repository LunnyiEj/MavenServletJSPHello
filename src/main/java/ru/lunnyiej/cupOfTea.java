package ru.lunnyiej;

public class cupOfTea {
    private int sipCount;

    public cupOfTea() {
        pourACup();
    }
    public int getSipCount() {
        return sipCount;
    }

    public void sip () {
        if (sipCount > 0) sipCount--;
    }

    public void pourACup () {
        sipCount = 5;
    }
}

