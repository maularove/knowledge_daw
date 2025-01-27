package com.fpmislata.jpalibros.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.service.interfaces.BookService;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookCreateUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookCreateUseCaseImpl implements BookCreateUseCase {

    private final BookService bookService;

    @Override
    public Book execute(Book book) {
        return bookService.save(book);
    }
}
