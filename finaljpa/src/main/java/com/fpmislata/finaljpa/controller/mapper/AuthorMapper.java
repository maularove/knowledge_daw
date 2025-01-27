package com.fpmislata.finaljpa.controller.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.controller.model.AuthorSimple;
import com.fpmislata.finaljpa.domain.service.model.Author;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    List<AuthorSimple> toAuthorList(List<Author> authors);

    AuthorSimple toAuthor(Author author);
}
