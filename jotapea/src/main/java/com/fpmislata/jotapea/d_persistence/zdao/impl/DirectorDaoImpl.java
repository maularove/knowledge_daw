package com.fpmislata.jotapea.d_persistence.zdao.impl;

import java.util.Optional;

import com.fpmislata.jotapea.a_common.annotion.Dao;
import com.fpmislata.jotapea.c_domain.service.model.Director;
import com.fpmislata.jotapea.d_persistence.zdao.impl.jpa.DirectorJpa;
import com.fpmislata.jotapea.d_persistence.zdao.impl.mapper.DirectorDaoMapper;
import com.fpmislata.jotapea.d_persistence.zdao.interfaces.DirectorDao;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class DirectorDaoImpl implements DirectorDao {

    private final DirectorJpa directorJpa;

    @Override
    public Optional<Director> findByMovieId(Integer movieId) {
        return directorJpa.findByMovieId(movieId)
                .map(directorDaoModel -> DirectorDaoMapper.INSTANCE.toDirector(directorDaoModel));
    }
}
