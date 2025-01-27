package com.fpmislata.finaljpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.finaljpa.controller.mapper.BookMapper;
import com.fpmislata.finaljpa.controller.model.BookSimple;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.domain.usecase.BookCreateUseCase;
import com.fpmislata.finaljpa.domain.usecase.BookFindAllUseCase;
import com.fpmislata.finaljpa.domain.usecase.BookFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(BookController.ENDPOINT)
public class BookController {

    private final BookFindAllUseCase bookFindAllUseCase;
    private final BookFindByIdUseCase bookFindByIdUseCase;
    private final BookCreateUseCase bookCreateUseCase;

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "api/books";

    @GetMapping()
    public List<BookSimple> findAll() {
        List<Book> books = bookFindAllUseCase.execute();
        return BookMapper.INSTANCE.toBookList(books);
    }

    @GetMapping("/{id}")
    public BookSimple findById(@PathVariable Integer id) {
        Book book = bookFindByIdUseCase.execute(id);
        return BookMapper.INSTANCE.toBookSimple(book);
    }

    @PostMapping()
    public Book create(@RequestBody Book book) {
        Book bookCreated = bookCreateUseCase.execute(book);
        return bookCreated;
    }
}