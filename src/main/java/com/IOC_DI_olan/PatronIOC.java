package com.IOC_DI_olan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PatronIOC implements PatronInterfaceIOC {
    
    @Override
    public String version(String data) {
        return "Version: " + data;
    }
}
