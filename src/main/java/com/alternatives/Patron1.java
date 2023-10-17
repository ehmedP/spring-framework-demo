package com.alternatives;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class Patron1 implements PatronInterface {

    // Alternative : eyni anda 1 proyekt calisir, digeri pasif veziyetde olur
    @Override
    public String version(String data) {
        return "Patron_1 version: " + data;
    }
}
