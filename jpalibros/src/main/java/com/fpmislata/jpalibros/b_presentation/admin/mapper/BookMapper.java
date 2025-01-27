package com.fpmislata.jpalibros.b_presentation.admin.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.b_presentation.admin.model.BookComplete;
import com.fpmislata.jpalibros.b_presentation.admin.model.BookSimple;
import com.fpmislata.jpalibros.c_domain.service.model.Book;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    List<BookSimple> toBookList(List<Book> books);

    BookSimple toBookSimple(Book book);

    BookComplete toBookComplete(Book book);
}
