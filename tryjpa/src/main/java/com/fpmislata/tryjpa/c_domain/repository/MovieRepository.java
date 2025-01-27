package com.fpmislata.tryjpa.c_domain.repository;

import java.util.Optional;

import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieRepository {

    ListWithCount<Movie> findAll(Integer page, Integer size);

    Optional<Movie> findById(Integer id);

    Movie save(Movie movie);
}
