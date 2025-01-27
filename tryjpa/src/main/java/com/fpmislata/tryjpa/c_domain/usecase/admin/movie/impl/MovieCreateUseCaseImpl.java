package com.fpmislata.tryjpa.c_domain.usecase.admin.movie.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.tryjpa.c_domain.service.interfaces.MovieService;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;
import com.fpmislata.tryjpa.c_domain.usecase.admin.movie.interfaces.MovieCreateUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieCreateUseCaseImpl implements MovieCreateUseCase {

    private final MovieService movieService;

    @Override
    public Movie execute(Movie movie) {
        return movieService.save(movie);
    }
}
