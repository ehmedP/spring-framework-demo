package com.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier")
@ApplicationScoped
public class Calisan {
    
    @Inject
    @QualifierMultiple  //  default olani kecif 2 ci ni goturmek ucun
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.version(data);
    }

}
