package com.fpmislata.jotapea.c_domain.usecase.common.movie.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.c_domain.service.interfaces.MovieService;
import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieFindAllUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieFindAllUseCaseImpl implements MovieFindAllUseCase {

    private final MovieService movieService;

    @Override
    public ListWithCount<Movie> execute(Integer page, Integer size) {
        return movieService.findAll(page, size);
    }
}
