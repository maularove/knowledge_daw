package com.fpmislata.jpalibros.d_persistence.zdao.impl;

import java.util.List;
import java.util.Optional;

import com.fpmislata.jpalibros.a_common.annotion.Dao;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa.AuthorJpa;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper.AuthorDaoMapper;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.AuthorDaoModel;
import com.fpmislata.jpalibros.d_persistence.zdao.interfaces.AuthorDao;

import lombok.RequiredArgsConstructor;

@Dao
@RequiredArgsConstructor
public class AuthorDaoImpl implements AuthorDao {

    private final AuthorJpa authorJpa;

    @Override
    public List<Author> findAll() {
        List<AuthorDaoModel> authorDaoModels = authorJpa.findAll();
        return authorDaoModels.stream()
                .map(AuthorDaoMapper.INSTANCE::toAuthor)
                .toList();
    }

    @Override
    public Author save(Author author) {
        AuthorDaoModel authorDaoModel = AuthorDaoMapper.INSTANCE.toAuthorDaoModel(author);
        return AuthorDaoMapper.INSTANCE.toAuthor(authorJpa.save(authorDaoModel));
    }

    @Override
    public void delete(Author author) {
        authorJpa.delete(AuthorDaoMapper.INSTANCE.toAuthorDaoModel(author));
    }

    @Override
    public Optional<Author> findById(Integer id) {
        return authorJpa.findById(id)
                .map(AuthorDaoMapper.INSTANCE::toAuthor);
    }
}
