package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.common.exception.ResourceNotFoundException;
import com.fpmislata.finaljpa.domain.service.BookService;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.domain.usecase.BookFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class BookFindByIdUseCaseImpl implements BookFindByIdUseCase {

    private final BookService bookService;

    @Override
    public Book execute(Integer id) {
        return bookService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }
}
