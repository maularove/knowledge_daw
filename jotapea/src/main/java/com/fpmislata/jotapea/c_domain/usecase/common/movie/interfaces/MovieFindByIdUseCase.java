package com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces;

import com.fpmislata.jotapea.c_domain.service.model.Movie;

public interface MovieFindByIdUseCase {
    Movie execute(Integer id);
}
