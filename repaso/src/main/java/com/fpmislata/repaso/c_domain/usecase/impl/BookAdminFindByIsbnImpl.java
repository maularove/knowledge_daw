package com.fpmislata.repaso.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.repaso.a_common.exception.ResourceNotFoundException;
import com.fpmislata.repaso.c_domain.service.interfaces.BookService;
import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminFindByIsbn;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookAdminFindByIsbnImpl implements BookAdminFindByIsbn {
    
    private final BookService bookService;

    @Override
    public Book execute(String isbn) {
        return bookService
                .findByIsbn(isbn)
                .orElseThrow(() -> new ResourceNotFoundException("Book isbn " + isbn + " not found"));
    }
}
