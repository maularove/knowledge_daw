package com.fpmislata.tryjpa.c_domain.service.interfaces;

import java.util.Optional;

import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieService {

    ListWithCount<Movie> findAll(Integer page, Integer size);

    Optional<Movie> findById(Integer id);

    Movie save(Movie movie);
}
