package com.fpmislata.bookstore.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categories {

    private Integer id;
    private String nameEs;
    private String nameEn;
    private String slug;
}
