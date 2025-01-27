package com.fpmislata.jotapea.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jotapea.c_domain.service.model.Actor;
import com.fpmislata.jotapea.d_persistence.zdao.impl.model.ActorDaoModel;

@Mapper
public interface ActorDaoMapper {

    ActorDaoMapper INSTANCE = Mappers.getMapper(ActorDaoMapper.class);

    Actor toActor(ActorDaoModel actorDaoModel);

    ActorDaoModel toActorDaoModel(Actor actor);
}
