package ru.lunnyiej;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// Аннотации managed bean компонента
@ManagedBean (name="Login") // определение managed bean и его наименования
@SessionScoped             // определение времени жизни - сессия
public class LoginBean {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isLogin(){
        if (login != null && login != ""){
            return true;
        } else {
            return false;
        }
    }

    public String link(){
        if (isLogin()){
            return "cupAction?faces-redirect=true";
        } else {
            return "login?faces-redirect=true";
        }
    }
}
