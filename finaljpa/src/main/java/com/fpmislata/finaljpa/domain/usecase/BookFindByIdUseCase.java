package com.fpmislata.finaljpa.domain.usecase;

import com.fpmislata.finaljpa.domain.service.model.Book;

public interface BookFindByIdUseCase {

    Book execute(Integer id);
}
