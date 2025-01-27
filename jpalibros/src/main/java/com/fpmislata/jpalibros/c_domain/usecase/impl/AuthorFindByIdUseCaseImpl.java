package com.fpmislata.jpalibros.c_domain.usecase.impl;

import com.fpmislata.jpalibros.a_common.annotion.UseCase;
import com.fpmislata.jpalibros.c_domain.service.interfaces.AuthorService;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorFindByIdUseCaseImpl implements AuthorFindByIdUseCase {

    private final AuthorService authorService;

    @Override
    public Author findById(Integer id) {
        return authorService.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }
}
