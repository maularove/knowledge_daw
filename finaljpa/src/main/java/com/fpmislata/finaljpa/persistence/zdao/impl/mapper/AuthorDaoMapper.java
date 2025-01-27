package com.fpmislata.finaljpa.persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.service.model.Author;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.AuthorDaoEntity;

@Mapper
public interface AuthorDaoMapper {

    AuthorDaoMapper INSTANCE = Mappers.getMapper(AuthorDaoMapper.class);

    Author toAuthor(AuthorDaoEntity authorDaoEntity);

    AuthorDaoEntity toAuthorDaoEntity(Author author);
}