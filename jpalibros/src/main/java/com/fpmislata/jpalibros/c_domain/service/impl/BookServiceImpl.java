package com.fpmislata.jpalibros.c_domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.repository.BookRepository;
import com.fpmislata.jpalibros.c_domain.service.interfaces.BookService;
import com.fpmislata.jpalibros.c_domain.service.model.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
