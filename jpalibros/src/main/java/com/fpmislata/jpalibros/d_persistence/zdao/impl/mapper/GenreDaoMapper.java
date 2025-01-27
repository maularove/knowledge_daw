package com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.c_domain.service.model.Genre;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.GenreDaoModel;

@Mapper
public interface GenreDaoMapper {

    GenreDaoMapper INSTANCE = Mappers.getMapper(GenreDaoMapper.class);

    GenreDaoModel toGenreDaoModel(Genre genre);

    Genre toGenre(GenreDaoModel genreDaoModel);
}
