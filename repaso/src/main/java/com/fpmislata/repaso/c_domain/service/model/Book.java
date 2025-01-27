package com.fpmislata.repaso.c_domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String synopsisEs;
    private String synopsisEn;
    private String cover;
    private Double discount;
    private Double price;
    private Publisher publisher;
    private Category category;
}
