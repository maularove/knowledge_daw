package com.fpmislata.finaljpa.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer id;
    private String nameEs;
    private String nameEn;
    private String slug;
}
