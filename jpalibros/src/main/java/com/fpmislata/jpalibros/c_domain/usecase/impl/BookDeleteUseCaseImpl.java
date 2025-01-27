package com.fpmislata.jpalibros.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.service.interfaces.BookService;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookDeleteUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookDeleteUseCaseImpl implements BookDeleteUseCase {

    private final BookService bookService;


    @Override
    public void execute(Integer id) {
        Book book = bookService.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        bookService.delete(book);
    }
}
