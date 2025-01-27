package com.fpmislata.jpalibros.d_persistence.zdao.impl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
public class AuthorDaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nationality;
    @Column(name = "biography_es")
    private String biographyEs;
    @Column(name = "biography_en")
    private String biographyEn;
    @Column(name = "birth_year")
    private Integer birthYear;
    @Column(name = "death_year")
    private Integer deathYear;
}
