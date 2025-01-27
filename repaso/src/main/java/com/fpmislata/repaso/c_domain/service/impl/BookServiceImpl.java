package com.fpmislata.repaso.c_domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.repaso.c_domain.repository.BookRepository;
import com.fpmislata.repaso.c_domain.service.interfaces.BookService;
import com.fpmislata.repaso.c_domain.service.model.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }
}
