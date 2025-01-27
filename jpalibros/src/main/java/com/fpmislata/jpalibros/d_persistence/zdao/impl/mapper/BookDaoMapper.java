package com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.BookDaoModel;

@Mapper(uses = { PublisherDaoMapper.class, CategoryDaoMapper.class, GenreDaoMapper.class, AuthorDaoMapper.class })
public interface BookDaoMapper {

    BookDaoMapper INSTANCE = Mappers.getMapper(BookDaoMapper.class);

    BookDaoModel toBookDaoModel(Book book);

    @Mapping(target = "authors", ignore = true)
    @Mapping(target = "genres", ignore = true)
    @Mapping(target = "publisher", ignore = true)
    @Mapping(target = "category", ignore = true)
    Book toBook(BookDaoModel bookDaoModel);
}
