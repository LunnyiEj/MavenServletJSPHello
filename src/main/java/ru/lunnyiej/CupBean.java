package ru.lunnyiej;

import ru.lunnyiej.cupOfTea;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// Аннотации managed bean компонента
@ManagedBean (name="Cup") // определение managed bean и его наименования
@ApplicationScoped             // определение времени жизни - сессия
public class CupBean {
    private final cupOfTea cup = new cupOfTea();

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
