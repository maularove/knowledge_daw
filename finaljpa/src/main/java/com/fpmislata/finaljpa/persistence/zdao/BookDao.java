package com.fpmislata.finaljpa.persistence.zdao;

import java.util.List;
import java.util.Optional;

import com.fpmislata.finaljpa.domain.service.model.Book;

public interface BookDao {

    List<Book> findAll();

    Optional<Book> findById(Integer id);

    Book save(Book book);
}
