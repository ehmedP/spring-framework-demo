
package com.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder

@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long nameId;
    private final String nameData = "This is my first jsp project"; 
}
