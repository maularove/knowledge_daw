package com.fpmislata.finaljpa.domain.usecase;

import com.fpmislata.finaljpa.domain.service.model.Book;

public interface BookCreateUseCase {

    Book execute(Book book);
}
