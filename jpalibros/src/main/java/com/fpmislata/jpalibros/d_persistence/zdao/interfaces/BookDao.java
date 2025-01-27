package com.fpmislata.jpalibros.d_persistence.zdao.interfaces;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Book;

public interface BookDao {

    List<Book> findAll();

    Optional<Book> findById(Integer id);

    Book save(Book book);

    void delete(Book book);
}
