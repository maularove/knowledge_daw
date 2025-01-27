package com.fpmislata.jpalibros.c_domain.usecase.interfaces;

import com.fpmislata.jpalibros.c_domain.service.model.Book;

public interface BookCreateUseCase {

    Book execute(Book book);
}
