package com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.AuthorDaoModel;

@Mapper
public interface AuthorDaoMapper {

    AuthorDaoMapper INSTANCE = Mappers.getMapper(AuthorDaoMapper.class);

    Author toAuthor(AuthorDaoModel authorDaoModel);

    AuthorDaoModel toAuthorDaoModel(Author author);
}
