package com.fpmislata.tryjpa.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.tryjpa.c_domain.service.model.Actor;
import com.fpmislata.tryjpa.d_persistence.zdao.impl.model.ActorDaoModel;

@Mapper
public interface ActorDaoMapper {

    ActorDaoMapper INSTANCE = Mappers.getMapper(ActorDaoMapper.class);

    Actor toActor(ActorDaoModel actorDaoModel);

    ActorDaoModel toActorDaoModel(Actor actor);
}
