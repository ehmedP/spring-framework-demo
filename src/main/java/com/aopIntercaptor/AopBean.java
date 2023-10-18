package com.aopIntercaptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "aopInterceptor")
@ApplicationScoped
public class AopBean implements Serializable {

    private static final Long serialVersion = 1L;
    
    @Inject
    private Login login;

    public String getAopBean() {
        return login.isLogin("yes");
    }
    
}
