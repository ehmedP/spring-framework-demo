package com.alternatives;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class Patron1 implements PatronInterface {

    @Override
    public String version(String data) {
        return "Patron_1 version: " + data;
    }
}
