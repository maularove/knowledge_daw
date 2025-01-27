package com.fpmislata.jpalibros.c_domain.usecase.impl;

import java.util.List;

import com.fpmislata.jpalibros.a_common.annotion.UseCase;
import com.fpmislata.jpalibros.c_domain.service.interfaces.AuthorService;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorFindAllUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorFIndAllUseCaseImpl implements AuthorFindAllUseCase {

    private final AuthorService authorService;

    @Override
    public List<Author> execute() {
        return authorService.findAll();
    }
}
