package com.fpmislata.tryjpa.d_persistence.repositoryImpl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.tryjpa.c_domain.repository.MovieRepository;
import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;
import com.fpmislata.tryjpa.d_persistence.zdao.interfaces.MovieDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieDao movieDao;

    @Override
    public ListWithCount<Movie> findAll(Integer page, Integer size) {
        return movieDao.findAll(page, size);
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        return movieDao.findById(id);
    }

    @Override
    public Movie save(Movie movie) {
        return movieDao.save(movie);
    }
}
