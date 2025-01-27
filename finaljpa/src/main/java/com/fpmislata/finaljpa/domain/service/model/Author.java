package com.fpmislata.finaljpa.domain.service.model;

import com.fpmislata.finaljpa.common.locale.LanguageUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private Integer id;
    private String name;
    private String nationality;
    private String biographyEn;
    private String biographyEs;
    private Integer birthYear;
    private Integer deathYear;

    public String getBiography() {
        String language = LanguageUtils.getCurrentLanguage();
        if ("en".equals(language)) {
            return biographyEn;
        }
        return biographyEs;
    }
}
