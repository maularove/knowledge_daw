package com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces;

import java.util.List;

import com.fpmislata.jotapea.c_domain.service.model.Movie;

public interface MovieGetAllUseCase {
    List<Movie> execute();
}
