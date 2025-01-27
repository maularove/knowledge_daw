package com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.c_domain.service.model.Publisher;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.PublisherDaoModel;

@Mapper
public interface PublisherDaoMapper {

    PublisherDaoMapper INSTANCE = Mappers.getMapper(PublisherDaoMapper.class);

    PublisherDaoModel toPublisherDaoModel(Publisher publisher);

    Publisher toPublisher(PublisherDaoModel publisherDaoModel);
}
