package com.fpmislata.jpalibros.c_domain.usecase.interfaces;

import com.fpmislata.jpalibros.c_domain.service.model.Author;

public interface AuthorFindByIdUseCase {

    Author findById(Integer id);
}
