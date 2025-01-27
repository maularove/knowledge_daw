package com.fpmislata.finaljpa.persistence.zdao.impl;

import java.util.List;
import java.util.Optional;

import com.fpmislata.finaljpa.common.annotion.Dao;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.persistence.zdao.BookDao;
import com.fpmislata.finaljpa.persistence.zdao.impl.jpa.BookJpa;
import com.fpmislata.finaljpa.persistence.zdao.impl.mapper.BookDaoMapper;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.BookDaoEntity;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final BookJpa bookJpa;

    @Override
    public List<Book> findAll() {
        List<BookDaoEntity> bookDaoEntity = bookJpa.findAll();
        return bookDaoEntity.stream()
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
        BookDaoEntity bookDaoEntity = BookDaoMapper.INSTANCE.toBookDaoEntity(book);
        return BookDaoMapper.INSTANCE.toBook(bookJpa.save(bookDaoEntity));
    }
}