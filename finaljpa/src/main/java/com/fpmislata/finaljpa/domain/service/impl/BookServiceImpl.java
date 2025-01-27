package com.fpmislata.finaljpa.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.finaljpa.domain.repository.BookRepository;
import com.fpmislata.finaljpa.domain.service.BookService;
import com.fpmislata.finaljpa.domain.service.model.Book;

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
}
