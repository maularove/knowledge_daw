package com.fpmislata.jpalibros.c_domain.usecase.impl;

import com.fpmislata.jpalibros.a_common.annotion.UseCase;
import com.fpmislata.jpalibros.c_domain.service.interfaces.AuthorService;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.c_domain.service.model.Book;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorCreateUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorDeleteUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorDeleteUseCaseImpl implements AuthorDeleteUseCase {

    private final AuthorService authorService;

    @Override
    public void delete(Integer id) {
        Author author = authorService.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        authorService.delete(author);
    }
}
