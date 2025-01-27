package com.fpmislata.jotapea.c_domain.repository;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;

public interface MovieRepository {

    ListWithCount<Movie> findAll(Integer page, Integer size);

    List<Movie> getAll();

    Optional<Movie> findById(Integer id);
}
