package com.fpmislata.tryjpa.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.tryjpa.c_domain.service.model.Director;
import com.fpmislata.tryjpa.d_persistence.zdao.impl.model.DirectorDaoModel;

@Mapper
public interface DirectorDaoMapper {

    DirectorDaoMapper INSTANCE = Mappers.getMapper(DirectorDaoMapper.class);

    Director toDirector(DirectorDaoModel directorDaoModel);

    DirectorDaoModel toDirectorDaoModel(Director director);
}
