package com.fpmislata.jotapea.b_presentation.admin.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jotapea.b_presentation.admin.model.DirectorSimple;
import com.fpmislata.jotapea.c_domain.service.model.Director;

@Mapper
public interface DirectorMapper {

    DirectorMapper INSTANCE = Mappers.getMapper(DirectorMapper.class);

    List<DirectorSimple> toDirectorSimpleList(List<Director> directors);

    DirectorSimple toDirectorSimple(Director director);
}
