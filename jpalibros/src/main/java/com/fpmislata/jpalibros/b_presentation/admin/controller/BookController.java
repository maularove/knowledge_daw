package com.fpmislata.jpalibros.b_presentation.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.jpalibros.b_presentation.admin.mapper.BookMapper;
import com.fpmislata.jpalibros.b_presentation.admin.mapper.PublisherMapper;
import com.fpmislata.jpalibros.b_presentation.admin.model.BookSimple;
import com.fpmislata.jpalibros.b_presentation.admin.model.PublisherSimple;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookCreateUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookDeleteUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookFindAllUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.BookFindByIdUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.PublisherFindByBookIdUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(BookController.ENDPOINT)
public class BookController {

    private final BookFindAllUseCase bookFindAllUseCase;
    private final BookFindByIdUseCase bookFindByIdUseCase;
    private final PublisherFindByBookIdUseCase publisherFindByBookIdUseCase;
    private final BookCreateUseCase bookCreateUseCase;
    private final BookDeleteUseCase bookDeleteUseCase;

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "/api/books";

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

    @GetMapping("/{id}/publisher")
    public PublisherSimple findByBookId(@PathVariable Integer id) {
        Publisher publisher = publisherFindByBookIdUseCase.execute(id);
        return PublisherMapper.INSTANCE.toPublisherSimple(publisher);
    }

    @PostMapping()
    public Book create(@RequestBody Book book) {
        Book bookCreated = bookCreateUseCase.execute(book);
        return bookCreated;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        bookDeleteUseCase.execute(id);
    }
}
