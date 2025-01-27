package com.fpmislata.finaljpa.domain.repository;

import java.util.List;
import java.util.Optional;

import com.fpmislata.finaljpa.domain.service.model.Book;

public interface BookRepository {

    List<Book> findAll();

    Optional<Book> findById(Integer id);

    Book save(Book book);
}
