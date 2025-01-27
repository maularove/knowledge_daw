package com.fpmislata.jpalibros.c_domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.repository.AuthorRepository;
import com.fpmislata.jpalibros.c_domain.service.interfaces.AuthorService;
import com.fpmislata.jpalibros.c_domain.service.model.Author;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public Optional<Author> findById(Integer id) {
        return authorRepository.findById(id);
    }
}
