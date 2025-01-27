package com.fpmislata.finaljpa.persistence.zdao.impl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// nombre en la base de datos
@Table(name = "authors")
@Data
@NoArgsConstructor
public class AuthorDaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nationality;
    @Column(name = "biography_es")
    private String biohraphyEs;
    @Column(name = "biography_en")
    private String biohraphyEn;
    @Column(name = "birth_year")
    private String birthYear;
    @Column(name = "death_year")
    private String deathYear;
}