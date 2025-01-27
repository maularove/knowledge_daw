package com.fpmislata.jotapea.c_domain.usecase.common.movie.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.c_domain.service.interfaces.MovieService;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieGetAllUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieGetAllUseCaseImpl implements MovieGetAllUseCase {

    private final MovieService movieService;

    @Override
    public List<Movie> execute() {
        return movieService.getAll();
    }
}
