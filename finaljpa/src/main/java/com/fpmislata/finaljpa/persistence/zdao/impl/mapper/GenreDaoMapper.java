package com.fpmislata.finaljpa.persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.service.model.Genre;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.GenreDaoEntity;

@Mapper
public interface GenreDaoMapper {

    GenreDaoMapper INSTANCE = Mappers.getMapper(GenreDaoMapper.class);

    Genre toGenre(GenreDaoEntity genreDaoEntity);

    GenreDaoEntity toGenreDaoEntity(Genre genre);
}
