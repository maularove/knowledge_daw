package com.fpmislata.jotapea.c_domain.service.interfaces;

import java.util.Optional;

import com.fpmislata.jotapea.c_domain.service.model.Director;

public interface DirectorService {

    Optional<Director> findByMovieId(Integer movieId);
}
