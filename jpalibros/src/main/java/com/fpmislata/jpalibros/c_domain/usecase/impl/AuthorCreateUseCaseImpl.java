package com.fpmislata.jpalibros.c_domain.usecase.impl;

import com.fpmislata.jpalibros.a_common.annotion.UseCase;
import com.fpmislata.jpalibros.c_domain.service.interfaces.AuthorService;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorCreateUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorCreateUseCaseImpl implements AuthorCreateUseCase {

    private final AuthorService authorService;

    @Override
    public Author execute(Author author) {
        return authorService.save(author);
    }
}
