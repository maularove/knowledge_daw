package com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces;

import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;

public interface MovieFindAllUseCase {

    ListWithCount<Movie> execute(Integer page, Integer size);
}
