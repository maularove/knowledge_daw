package com.fpmislata.finaljpa.domain.usecase.impl;

import java.util.List;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.domain.service.BookService;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.domain.usecase.BookFindAllUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class BookFindAllUseCaseImpl implements BookFindAllUseCase {

    private final BookService bookService;

    @Override
    public List<Book> execute() {
        return bookService.findAll();
    }
}
