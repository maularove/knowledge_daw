package com.fpmislata.tryjpa.c_domain.usecase.common.movie.impl;

import com.fpmislata.tryjpa.a_common.annotion.UseCase;
import com.fpmislata.tryjpa.c_domain.service.interfaces.MovieService;
import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;
import com.fpmislata.tryjpa.c_domain.usecase.common.movie.interfaces.MovieFindAllUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class MovieFindAllUseCaseImpl implements MovieFindAllUseCase {

    private final MovieService movieService;

    @Override
    public ListWithCount<Movie> execute(Integer page, Integer size) {
        return movieService.findAll(page, size);
    }
}
