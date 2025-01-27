package com.fpmislata.repaso.d_persistence.zdao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fpmislata.repaso.c_domain.service.model.Book;
import com.fpmislata.repaso.d_persistence.zdao.impl.mapper.BookRowMapper;
import com.fpmislata.repaso.d_persistence.zdao.interfaces.BookDao;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = "SELECT * FROM books WHERE isbn = ?";
        try {
            return Optional.of(jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Book> findById(Long id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        try {
            return Optional.of(jdbcTemplate.queryForObject(sql, new BookRowMapper(), id));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
