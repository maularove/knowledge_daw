package com.fpmislata.bookstore.persistence.zdao.interfaces;

import java.util.List;

import com.fpmislata.bookstore.domain.service.model.Books;

public interface BookDao {

    List<Books> getAll();
}
