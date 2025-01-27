package com.fpmislata.jotapea.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jotapea.c_domain.service.model.Director;
import com.fpmislata.jotapea.d_persistence.zdao.impl.model.DirectorDaoModel;

@Mapper
public interface DirectorDaoMapper {

    DirectorDaoMapper INSTANCE = Mappers.getMapper(DirectorDaoMapper.class);

    DirectorDaoModel toDirectorDaoModel(Director director);

    Director toDirector(DirectorDaoModel directorDaoModel);
}
