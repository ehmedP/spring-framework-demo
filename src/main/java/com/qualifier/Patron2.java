package com.qualifier;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String version(String data) {
        return "Patron_2 " + data;
    }
}
