package com.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@Default
@ApplicationScoped
public class Patron1 implements PatronInterface {
    
    @Override
    public String version(String data) {
        return "Patron_1 " + data;
    }
}
