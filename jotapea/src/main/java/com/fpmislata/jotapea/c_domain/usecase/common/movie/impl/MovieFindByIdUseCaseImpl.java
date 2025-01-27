package com.fpmislata.jotapea.c_domain.usecase.common.movie.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.a_common.exception.ResourceNotFoundException;
import com.fpmislata.jotapea.c_domain.service.interfaces.MovieService;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieFindByIdUseCaseImpl implements MovieFindByIdUseCase {

    private final MovieService movieService;

    @Override
    public Movie execute(Integer id) {
        return movieService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie not found"));
    }
}
