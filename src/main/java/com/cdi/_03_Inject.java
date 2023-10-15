
package com.cdi;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "injecttuto")
@ApplicationScoped

public class _03_Inject {
    
    @Inject
    List<String> tukeden;

    public List<String> getTukeden() {
        return tukeden;
    }
}
