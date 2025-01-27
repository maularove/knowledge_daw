package com.fpmislata.jotapea.c_domain.repository;

import java.util.Optional;

import com.fpmislata.jotapea.c_domain.service.model.Director;

public interface DirectorRepository {

    Optional<Director> findByMovieId(Integer movieId);
}
