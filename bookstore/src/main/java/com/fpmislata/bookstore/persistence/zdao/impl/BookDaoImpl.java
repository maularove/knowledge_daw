package com.fpmislata.bookstore.persistence.zdao.impl;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fpmislata.bookstore.domain.service.model.Books;
import com.fpmislata.bookstore.persistence.zdao.impl.mapper.BookRowMapper;
import com.fpmislata.bookstore.persistence.zdao.interfaces.BookDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {
    
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Books> getAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }
}
