package com.fpmislata.finaljpa.controller.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.controller.model.BookSimple;
import com.fpmislata.finaljpa.domain.service.model.Book;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    List<BookSimple> toBookList(List<Book> books);

    BookSimple toBookSimple(Book book);
}
