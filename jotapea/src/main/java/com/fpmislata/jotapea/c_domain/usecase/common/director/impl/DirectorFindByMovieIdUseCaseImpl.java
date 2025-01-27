package com.fpmislata.jotapea.c_domain.usecase.common.director.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.c_domain.service.interfaces.DirectorService;
import com.fpmislata.jotapea.c_domain.service.model.Director;
import com.fpmislata.jotapea.c_domain.usecase.common.director.interfaces.DirectorFindByMovieIdUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DirectorFindByMovieIdUseCaseImpl implements DirectorFindByMovieIdUseCase {

    private final DirectorService directorService;

    @Override
    public Director execute(Integer movieId) {
        return directorService.findByMovieId(movieId)
                .orElseThrow(() -> new RuntimeException("Director not found"));
    }
}
