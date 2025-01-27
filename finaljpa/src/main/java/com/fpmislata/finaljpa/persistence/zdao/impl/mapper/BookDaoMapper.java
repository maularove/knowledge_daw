package com.fpmislata.finaljpa.persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.service.model.Book;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.BookDaoEntity;

@Mapper(uses = { PublisherDaoMapper.class, CategoryDaoMapper.class, GenreDaoMapper.class, AuthorDaoMapper.class })
public interface BookDaoMapper {

    BookDaoMapper INSTANCE = Mappers.getMapper(BookDaoMapper.class);

    BookDaoEntity toBookDaoEntity(Book book);

    @Mapping(target = "authors", ignore = true)
    @Mapping(target = "genres", ignore = true)
    @Mapping(target = "publisher", ignore = true)
    @Mapping(target = "category", ignore = true)
    Book toBook(BookDaoEntity bookDaoEntity);
}
