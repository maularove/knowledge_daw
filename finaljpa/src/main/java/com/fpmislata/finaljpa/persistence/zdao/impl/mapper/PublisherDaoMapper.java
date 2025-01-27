package com.fpmislata.finaljpa.persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.service.model.Publisher;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.PublisherDaoEntity;

@Mapper
public interface PublisherDaoMapper {

    PublisherDaoMapper INSTANCE = Mappers.getMapper(PublisherDaoMapper.class);

    Publisher toPublisher(PublisherDaoEntity publisherDaoEntity);

    PublisherDaoEntity toPublisherDaoEntity(Publisher publisher);
}