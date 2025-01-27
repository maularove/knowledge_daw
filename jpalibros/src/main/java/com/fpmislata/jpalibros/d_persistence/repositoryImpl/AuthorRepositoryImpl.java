package com.fpmislata.jpalibros.d_persistence.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.jpalibros.c_domain.repository.AuthorRepository;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.d_persistence.zdao.interfaces.AuthorDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private final AuthorDao authorDao;

    @Override
    public Author save(Author author) {
        return authorDao.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorDao.findAll();
    }

    @Override
    public void delete(Author author) {
        authorDao.delete(author);
    }

    @Override
    public Optional<Author> findById(Integer id) {
        return authorDao.findById(id);
    }
}
