package com.fpmislata.tryjpa.c_domain.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.tryjpa.c_domain.repository.MovieRepository;
import com.fpmislata.tryjpa.c_domain.service.interfaces.MovieService;
import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

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
    public Optional<Movie> findById(Integer id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
}
