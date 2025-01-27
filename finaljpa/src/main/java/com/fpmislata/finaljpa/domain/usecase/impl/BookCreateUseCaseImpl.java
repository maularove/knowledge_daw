package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.domain.service.BookService;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.domain.usecase.BookCreateUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class BookCreateUseCaseImpl implements BookCreateUseCase {

    private final BookService bookService;

    @Override
    public Book execute(Book book) {
        return bookService.save(book);
    }
}
