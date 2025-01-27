package com.fpmislata.repaso.d_persistence.zdao.interfaces;

import java.util.List;
import java.util.Optional;

import com.fpmislata.repaso.c_domain.service.model.Book;

public interface BookDao {
    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);

    Optional<Book> findById(Long id);
}
