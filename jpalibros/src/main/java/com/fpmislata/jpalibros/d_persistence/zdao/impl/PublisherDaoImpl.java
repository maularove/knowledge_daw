package com.fpmislata.jpalibros.d_persistence.zdao.impl;

import java.util.Optional;

import com.fpmislata.jpalibros.a_common.annotion.Dao;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa.PublisherJpa;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper.PublisherDaoMapper;
import com.fpmislata.jpalibros.d_persistence.zdao.interfaces.PublisherDao;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class PublisherDaoImpl implements PublisherDao {

    private final PublisherJpa publisherJpa;

    @Override
    public Optional<Publisher> findByBookId(Integer bookId) {
        return publisherJpa.findByMovieId(bookId)
                .map(publisherDaoModel -> PublisherDaoMapper.INSTANCE.toPublisher(publisherDaoModel));
    }
}
