package com.fpmislata.bookstore.persistence.zdao.impl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fpmislata.bookstore.domain.service.model.Books;

public class BookRowMapper implements RowMapper<Books> {

    @Override
    public Books mapRow(ResultSet rs, int rowNum) throws SQLException {

        Books book = new Books();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("isbn"));
        book.setTitleEs(rs.getString("title_es"));
        book.setTitleEn(rs.getString("title_en"));
        book.setSynopsisEs(rs.getString("synopsis_es"));
        book.setSynopsisEn(rs.getString("synopsis_en"));
        book.setPrice(rs.getDouble("price"));
        book.setDiscount(rs.getDouble("discount"));
        book.setCover(rs.getString("cover"));
        // book.setPublisher(new PublisherRowMapper().mapRow(rs, rowNum));
        // book.setCategory(new CategoryRowMapper().mapRow(rs, rowNum));
        return book;
    }
}
