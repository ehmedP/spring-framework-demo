package com.aopSteretype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MySterotype
@Data @AllArgsConstructor @NoArgsConstructor
public class MySterotypeBean {
    private Long id;
    private String name = "MySterotypeBean Name :)";
    private String trade;
}
