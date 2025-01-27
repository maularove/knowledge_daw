package com.fpmislata.jpalibros.b_presentation.admin.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.b_presentation.admin.model.AuthorSimple;
import com.fpmislata.jpalibros.c_domain.service.model.Author;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    List<AuthorSimple> toAuthorList(List<Author> authors);

    AuthorSimple toAuthorSimple(Author author);
}
