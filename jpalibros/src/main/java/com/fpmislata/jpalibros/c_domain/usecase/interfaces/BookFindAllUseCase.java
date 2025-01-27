package com.fpmislata.jpalibros.c_domain.usecase.interfaces;

import java.util.List;

import com.fpmislata.jpalibros.c_domain.service.model.Book;

public interface BookFindAllUseCase {

    List<Book> execute();
}
