package com.fpmislata.jpalibros.b_presentation.admin.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.jpalibros.b_presentation.admin.mapper.AuthorMapper;
import com.fpmislata.jpalibros.b_presentation.admin.model.AuthorSimple;
import com.fpmislata.jpalibros.c_domain.service.model.Author;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorCreateUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorDeleteUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorFindAllUseCase;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.AuthorFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(AuthorController.ENDPOINT)
public class AuthorController {

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "/api/authors";

    private final AuthorFindAllUseCase authorFindAllUseCase;
    private final AuthorCreateUseCase authorCreateUseCase;
    private final AuthorFindByIdUseCase authorFindByIdUseCase;
    private final AuthorDeleteUseCase authorDeleteUseCase;

    @GetMapping()
    public List<AuthorSimple> findAll() {
        List<Author> authors = authorFindAllUseCase.execute();
        return AuthorMapper.INSTANCE.toAuthorList(authors);
    }

    @GetMapping("/{id}")
    AuthorSimple findById(@PathVariable Integer id) {
        Author author = authorFindByIdUseCase.findById(id);
        return AuthorMapper.INSTANCE.toAuthorSimple(author);
    }

    @PostMapping()
    public Author create(@Valid @RequestBody Author author) {
        Author authorCreated = authorCreateUseCase.execute(author);
        return authorCreated;
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        authorDeleteUseCase.delete(id);
    }
}
