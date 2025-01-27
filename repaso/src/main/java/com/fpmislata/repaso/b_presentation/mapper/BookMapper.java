package com.fpmislata.repaso.b_presentation.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.repaso.b_presentation.model.BookCollection;
import com.fpmislata.repaso.c_domain.service.model.Book;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    List<BookCollection> toBookCollection(List<Book> books);

    BookCollection toBookDetailCollection(Book book);
}
