package com.fpmislata.jpalibros.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.a_common.exception.ResourceNotFoundException;
import com.fpmislata.jpalibros.c_domain.service.interfaces.BookService;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookFindByIdUseCaseImpl implements BookFindByIdUseCase {

    private final BookService bookService;

    @Override
    public Book execute(Integer id) {
        return bookService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }
}
