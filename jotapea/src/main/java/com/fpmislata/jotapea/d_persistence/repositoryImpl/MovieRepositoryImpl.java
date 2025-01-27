package com.fpmislata.jotapea.d_persistence.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.jotapea.c_domain.repository.MovieRepository;
import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.d_persistence.zdao.interfaces.MovieDao;

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
    public List<Movie> getAll() {
        return movieDao.getAll();
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        return movieDao.findById(id);
    }
}
