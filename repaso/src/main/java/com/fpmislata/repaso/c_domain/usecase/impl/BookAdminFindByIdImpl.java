package com.fpmislata.repaso.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.repaso.a_common.exception.ResourceNotFoundException;
import com.fpmislata.repaso.c_domain.service.interfaces.BookService;
import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminFindById;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookAdminFindByIdImpl implements BookAdminFindById {
    
    private final BookService bookService;

    @Override
    public Book execute(Long id) {
        return bookService.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Book id " + id + " not found"));
    }
}
