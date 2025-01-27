package com.fpmislata.jpalibros.c_domain.service.model;

import java.math.BigDecimal;
import java.util.List;

import com.fpmislata.jpalibros.a_common.locale.LanguageUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String synopsisEs;
    private String synopsisEn;
    private BigDecimal price;
    private BigDecimal discount;
    private String cover;
    private Publisher publisher;
    private Category category;
    private List<Genre> genres;
    private List<Author> authors;

    public String getTitle() {
        String language = LanguageUtils.getCurrentLanguage();
        if ("en".equals(language)) {
            return titleEn;
        }
        return titleEs;
    }

    public String getSynopsis() {
        String language = LanguageUtils.getCurrentLanguage();
        if ("en".equals(language)) {
            return synopsisEn;
        }
        return synopsisEs;
    }
}
