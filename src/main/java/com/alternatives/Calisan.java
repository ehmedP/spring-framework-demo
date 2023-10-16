package com.alternatives;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.version(data);
    }
    
}
