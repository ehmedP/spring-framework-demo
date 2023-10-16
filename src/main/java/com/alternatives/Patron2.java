package com.alternatives;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class Patron2 implements PatronInterface {

    @Override
    public String version(String data) {
        return "Patron_2 version: " + data;
    }
}
