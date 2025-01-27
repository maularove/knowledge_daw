package com.fpmislata.jotapea.d_persistence.repositoryImpl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.jotapea.c_domain.repository.DirectorRepository;
import com.fpmislata.jotapea.c_domain.service.model.Director;
import com.fpmislata.jotapea.d_persistence.zdao.interfaces.DirectorDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DirectorRepositoryImpl implements DirectorRepository {

    private final DirectorDao directorDao;

    @Override
    public Optional<Director> findByMovieId(Integer movieId) {
        return directorDao.findByMovieId(movieId);
    }
}
