package com.fpmislata.bookstore.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private Long id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String synopsisEs;
    private String synopsisEn;
    private Double price;
    private Double discount;
    private String cover;
    private Publisher publisher;
    private Categories category;
}
