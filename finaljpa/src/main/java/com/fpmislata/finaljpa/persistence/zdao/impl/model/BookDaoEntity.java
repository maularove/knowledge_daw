package com.fpmislata.finaljpa.persistence.zdao.impl.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class BookDaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String isbn;

    @Column(name = "title_es")
    private String titleEs;

    @Column(name = "title_en")
    private String titleEn;

    @Column(name = "synopsis_es")
    private String synopsisEs;

    @Column(name = "synopsis_en")
    private String synopsisEn;

    private BigDecimal price;
    private BigDecimal discount;
    private String cover;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private PublisherDaoEntity publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryDaoEntity category;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "books_genres", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<GenreDaoEntity> genre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "books_authors", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<AuthorDaoEntity> author;
}