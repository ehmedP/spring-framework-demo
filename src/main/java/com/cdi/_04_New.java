
package com.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.StudentDTO;

import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {
    
    @Produces
    public String uretilenData( @New StudentDTO studentDTO) {
        studentDTO = StudentDTO.builder()
                                .studenId(1L)
                                .studentName("Ehmed")
                                .studentSurname("Ehmedli")
                                .build();

        return studentDTO.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}
