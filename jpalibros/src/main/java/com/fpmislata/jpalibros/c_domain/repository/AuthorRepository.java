package com.fpmislata.jpalibros.c_domain.repository;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Author;

public interface AuthorRepository {

    List<Author> findAll();

    Optional<Author> findById(Integer id);

    Author save(Author author);

    void delete(Author author);
}
