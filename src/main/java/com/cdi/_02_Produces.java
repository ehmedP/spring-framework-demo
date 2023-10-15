
package com.cdi;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {

    @Produces
    public List<String> getList() {
        List<String> list = new ArrayList<>();

        list.add("Html5");
        list.add("Css");
        list.add("JavaScript");
        list.add("React js");
        list.add("Angular js");
        list.add("Veu");

        return list;   
    }
}
