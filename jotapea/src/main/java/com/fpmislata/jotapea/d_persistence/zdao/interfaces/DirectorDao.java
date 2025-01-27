package com.fpmislata.jotapea.d_persistence.zdao.interfaces;

import java.util.Optional;

import com.fpmislata.jotapea.c_domain.service.model.Director;

public interface DirectorDao {

    Optional<Director> findByMovieId(Integer movieId);
}
