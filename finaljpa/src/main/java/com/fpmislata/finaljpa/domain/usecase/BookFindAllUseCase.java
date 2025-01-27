package com.fpmislata.finaljpa.domain.usecase;

import java.util.List;

import com.fpmislata.finaljpa.domain.service.model.Book;

public interface BookFindAllUseCase {

    List<Book> execute();
}