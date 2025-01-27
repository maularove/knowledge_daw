package com.fpmislata.tryjpa.c_domain.usecase.common.movie.interfaces;

import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

public interface MovieFindAllUseCase {

    ListWithCount<Movie> execute(Integer page, Integer size);
}
