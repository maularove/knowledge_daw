package com.fpmislata.repaso.c_domain.usecase.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpmislata.repaso.c_domain.service.interfaces.BookService;
import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminGetAll;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookAdminGetAllImpl implements BookAdminGetAll {

    private final BookService bookService;

    @Override
    public List<Book> execute() {
        return bookService.getAll();
    }
}
