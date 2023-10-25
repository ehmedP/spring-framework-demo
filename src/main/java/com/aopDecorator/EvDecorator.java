package com.aopDecorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class EvDecorator implements iEv {
    
    @Inject @Delegate
    private iEv iev;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator calisdi");
        String dataInformation = iev.boyama(data);
        
        if(dataInformation.equals("kodluyoruz")) {
            dataInformation = dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
