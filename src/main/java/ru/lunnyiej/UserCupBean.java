package ru.lunnyiej;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class UserCupBean {

    @Inject
    private CupOfTeaBeen cup;

    public int getSipCount() {
        return cup.getSipCount();
    }

    public void sip () {
        cup.sip();
    }

    public void fillTheCup () {
        cup.fillTheCup();
    }
}
