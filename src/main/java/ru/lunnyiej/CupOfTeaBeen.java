package ru.lunnyiej;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@Named
@ApplicationScoped
public class CupOfTeaBeen implements Serializable {
    private int sipCount;

    public CupOfTeaBeen() {
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

