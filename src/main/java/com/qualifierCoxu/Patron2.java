package com.qualifierCoxu;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple2(Secenekler.FIRST)
@ApplicationScoped
public class Patron2 implements PatronInterface {
        
    @Override
    public String version(String data) {
        return "Patron2 version: " + data;
    }
}
