package com.fpmislata.jpalibros.d_persistence.zdao.impl;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jpalibros.a_common.annotion.Dao;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa.BookJpa;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper.BookDaoMapper;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.BookDaoModel;
import com.fpmislata.jpalibros.d_persistence.zdao.interfaces.BookDao;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final BookJpa bookJpa;

    @Override
    public List<Book> findAll() {
        List<BookDaoModel> bookDaoModels = bookJpa.findAll();
        return bookDaoModels.stream()
                .map(BookDaoMapper.INSTANCE::toBook)
                .toList();
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookJpa.findById(id)
                .map(bookDaoModel -> BookDaoMapper.INSTANCE.toBook(bookDaoModel));
    }

    @Override
    public Book save(Book book) {
        BookDaoModel bookDaoModel = BookDaoMapper.INSTANCE.toBookDaoModel(book);
        return BookDaoMapper.INSTANCE.toBook(bookJpa.save(bookDaoModel));
    }

    @Override
    public void delete(Book book) {
        bookJpa.delete(BookDaoMapper.INSTANCE.toBookDaoModel(book));
    }
}
