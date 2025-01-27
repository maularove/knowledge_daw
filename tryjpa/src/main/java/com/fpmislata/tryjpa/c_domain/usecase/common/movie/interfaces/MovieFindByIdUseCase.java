package com.fpmislata.tryjpa.c_domain.usecase.common.movie.interfaces;

import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieFindByIdUseCase {

    Movie execute(Integer id);
}
