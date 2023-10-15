package com.IOC_DI_olan;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Named(value = "calisanIOC")
@AllArgsConstructor
@NoArgsConstructor
@ApplicationScoped

public class CalisanIOC {
    
    @Inject
    private PatronInterfaceIOC patronInterfaceIOC;
    
    public String getData(String data) {
        return patronInterfaceIOC.version(data);
    }
}
