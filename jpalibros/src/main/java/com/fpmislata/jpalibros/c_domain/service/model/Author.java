package com.fpmislata.jpalibros.c_domain.service.model;

import com.fpmislata.jpalibros.a_common.locale.LanguageUtils;
import com.fpmislata.jpalibros.a_common.validation.name.ValidName;
import com.fpmislata.jpalibros.a_common.validation.year.ValidYear;

import jakarta.validation.ValidationException;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private Integer id;

    // @NotNull(message = "pepe")
    @ValidName
    private String name;
    private String nationality;
    private String biographyEs;
    private String biographyEn;

    // @NotNull
    // @Min(value = 1880, message = "el año debe ser posterior a 1880")
    // @ValidYear
    private Integer birthYear;
    private Integer deathYear;

    public String getBiography() {
        String language = LanguageUtils.getCurrentLanguage();
        if ("en".equals(language)) {
            return biographyEn;
        }
        return biographyEs;
    }

    public void setBirthYear(Integer birthYear) {
        if (this.deathYear != null && birthYear != null && this.deathYear < birthYear) {
            throw new ValidationException("El año de nacimiento no puede ser mayor que el año de la muerte");
        }
        this.birthYear = birthYear;
    }
}
