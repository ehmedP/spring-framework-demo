package com.aopDecorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "aopDecorator")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    private iEv iev;

    public String beanMethod(String data) {
        return iev.boyama(data);
    }
    
}
