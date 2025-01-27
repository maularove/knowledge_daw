package com.fpmislata.tryjpa.c_domain.usecase.admin.movie.interfaces;

import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieCreateUseCase {

    Movie execute(Movie movie);
}
