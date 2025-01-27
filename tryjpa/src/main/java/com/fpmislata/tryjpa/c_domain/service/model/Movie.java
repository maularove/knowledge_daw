package com.fpmislata.tryjpa.c_domain.service.model;

import java.util.List;

import com.fpmislata.tryjpa.a_common.locale.LanguageUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private Integer id;
    private String titleEn;
    private String titleEs;
    private String descriptionEn;
    private String descriptionEs;
    private Director director;
    private List<Actor> actors;

    public String getTitle() {
        String language = LanguageUtils.getCurrentLanguage();
        return language.equals("en") ? titleEn : titleEs;
    }

    public String getDescription() {
        String language = LanguageUtils.getCurrentLanguage();
        return language.equals("en") ? descriptionEn : descriptionEs;
    }
}
