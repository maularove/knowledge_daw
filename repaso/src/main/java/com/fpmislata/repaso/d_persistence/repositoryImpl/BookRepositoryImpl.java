package com.fpmislata.repaso.d_persistence.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.repaso.c_domain.repository.BookRepository;
import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.d_persistence.zdao.interfaces.BookDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookDao.findById(id);
    }
}
