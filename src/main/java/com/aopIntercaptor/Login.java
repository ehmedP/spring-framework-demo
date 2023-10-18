package com.aopIntercaptor;

import javax.enterprise.context.ApplicationScoped;

@Intercaptor
@ApplicationScoped
public class Login {
 
    public String isLogin(String data) {
        return "isLogin: " + data;
    }
}
