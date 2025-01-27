package com.fpmislata.finaljpa.persistence.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.finaljpa.domain.repository.BookRepository;
import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.persistence.zdao.BookDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookDao.save(book);
    }
}
