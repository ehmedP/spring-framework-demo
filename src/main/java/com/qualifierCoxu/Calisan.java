package com.qualifierCoxu;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier2")
@ApplicationScoped
public class Calisan {
    
    @Inject
    @QualifierMultiple2(Secenekler.SECOND)
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.version(data);
    }
}
