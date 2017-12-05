package ru.lunnyiej;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@SessionScoped
public class LoginBean implements Serializable{
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
