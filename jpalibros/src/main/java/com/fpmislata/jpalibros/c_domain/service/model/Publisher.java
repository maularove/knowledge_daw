package com.fpmislata.jpalibros.c_domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {

    private Integer id;
    private String name;
    private String slug;
}
