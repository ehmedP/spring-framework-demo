package com.aopDecorator;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Bahceli implements iEv {
    
    @Override
    public String boyama(String data) {
        return data;
    }
}
