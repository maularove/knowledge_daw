package com.fpmislata.jpalibros.c_domain.usecase.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.service.interfaces.BookService;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookFindAllUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookFindAllUseCaseImpl implements BookFindAllUseCase {

    private final BookService bookService;

    @Override
    public List<Book> execute() {
        return bookService.findAll();
    }
}
