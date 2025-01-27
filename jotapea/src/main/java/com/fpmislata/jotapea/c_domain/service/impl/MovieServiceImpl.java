package com.fpmislata.jotapea.c_domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.jotapea.c_domain.repository.MovieRepository;
import com.fpmislata.jotapea.c_domain.service.interfaces.MovieService;
import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public ListWithCount<Movie> findAll(Integer page, Integer size) {
        return movieRepository.findAll(page, size);
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        return movieRepository.findById(id);
    }
}
