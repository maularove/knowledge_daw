package com.fpmislata.jpalibros.c_domain.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Book;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Integer id);

    Book save(Book book);

    void delete(Book book);
}
