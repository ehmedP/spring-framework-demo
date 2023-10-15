package com.cdi;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named(value = "producestuto")
public class _02_Produces {
    
    @Produces
    public List<String> getList() {
        List<String> liste = new ArrayList<>();
        liste.add("Html5");
        liste.add("css");
        liste.add("JavaScript");
        liste.add("React");
        liste.add("Angular");

        return liste;
    }    
}
