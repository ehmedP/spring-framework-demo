package com.qualifierCoxu;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple2(Secenekler.SECOND)
@ApplicationScoped
public class Patron3 implements PatronInterface {
        
    @Override
    public String version(String data) {
        return "Patron3 version: " + data;
    }
}
