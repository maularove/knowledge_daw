package com.fpmislata.jotapea.c_domain.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.c_domain.repository.DirectorRepository;
import com.fpmislata.jotapea.c_domain.service.interfaces.DirectorService;
import com.fpmislata.jotapea.c_domain.service.model.Director;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    @Override
    public Optional<Director> findByMovieId(Integer movieId) {
        return directorRepository.findByMovieId(movieId);
    }
}
