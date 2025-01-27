package com.fpmislata.tryjpa.d_persistence.zdao.interfaces;

import java.util.Optional;

import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieDao {

    ListWithCount<Movie> findAll(Integer page, Integer size);

    Optional<Movie> findById(Integer id);

    Movie save(Movie movie);
}
