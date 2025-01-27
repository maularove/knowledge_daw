package com.fpmislata.repaso.d_persistence.zdao.impl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fpmislata.repaso.c_domain.service.model.Book;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("isbn"));
        book.setTitleEs(rs.getString("title_es"));
        book.setTitleEn(rs.getString("title_en"));
        book.setSynopsisEs(rs.getString("synopsis_es"));
        book.setSynopsisEn(rs.getString("synopsis_en"));
        book.setCover(rs.getString("cover"));
        book.setDiscount(rs.getDouble("discount"));
        book.setPrice(rs.getDouble("price"));

        return book;
    }
}
