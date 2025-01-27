package com.fpmislata.jotapea.d_persistence.zdao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.fpmislata.jotapea.a_common.annotion.Dao;
import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.d_persistence.zdao.impl.jpa.MovieJpa;
import com.fpmislata.jotapea.d_persistence.zdao.impl.mapper.MovieDaoMapper;
import com.fpmislata.jotapea.d_persistence.zdao.impl.model.MovieDaoModel;
import com.fpmislata.jotapea.d_persistence.zdao.interfaces.MovieDao;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class MovieDaoImpl implements MovieDao {

    private final MovieJpa movieJpa;

    @Override
    public ListWithCount<Movie> findAll(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<MovieDaoModel> moviePage = movieJpa.findAll(pageable);

        // mapper convierte de daomodel a model
        return new ListWithCount<Movie>(
                moviePage.stream()
                        .map(MovieDaoMapper.INSTANCE::toMovie)
                        .toList(),
                moviePage.getTotalElements());
    }

    @Override
    public List<Movie> getAll() {
        List<MovieDaoModel> movieDaoModel = movieJpa.findAll();
        return movieDaoModel.stream()
                .map(MovieDaoMapper.INSTANCE::toMovie)
                .toList();
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        return movieJpa.findById(id)
                .map(movieDaoModel -> MovieDaoMapper.INSTANCE.toMovie(movieDaoModel));
    }
}
