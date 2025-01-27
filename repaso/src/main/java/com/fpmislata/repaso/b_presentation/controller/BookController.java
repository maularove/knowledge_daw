package com.fpmislata.repaso.b_presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.repaso.b_presentation.mapper.BookMapper;
import com.fpmislata.repaso.b_presentation.model.BookCollection;
import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminFindById;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminFindByIsbn;
import com.fpmislata.repaso.c_domain.usecase.interfaces.BookAdminGetAll;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
@RequestMapping(BookController.ENDPOINT)
public class BookController {

    private final BookAdminGetAll bookAdminGetAll;
    private final BookAdminFindByIsbn bookAdminFindByIsbn;
    private final BookAdminFindById bookAdminFindById;

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "/api/books";

    @GetMapping()
    public List<BookCollection> getAll() {
        List<Book> books = bookAdminGetAll.execute();
        List<BookCollection> bookCollections = BookMapper.INSTANCE.toBookCollection(books);

        return bookCollections;
    }

    @GetMapping("/{isbn}")
    public BookCollection findByIsbn(@PathVariable String isbn) {
        Book bookss = bookAdminFindByIsbn.execute(isbn);
        BookCollection bookCollection = BookMapper.INSTANCE.toBookDetailCollection(bookss);
        return bookCollection;     
    }

    @GetMapping("/{id}")
    public BookCollection findById(@PathVariable Long id) {
        Book bookss = bookAdminFindById.execute(id);
        BookCollection bookCollection = BookMapper.INSTANCE.toBookDetailCollection(bookss);
        return bookCollection;     
    }
}
