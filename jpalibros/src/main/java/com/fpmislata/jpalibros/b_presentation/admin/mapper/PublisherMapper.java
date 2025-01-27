package com.fpmislata.jpalibros.b_presentation.admin.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.b_presentation.admin.model.PublisherSimple;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher toPublisher(PublisherSimple publisherSimple);

    PublisherSimple toPublisherSimple(Publisher publisher);
}
