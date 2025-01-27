package com.fpmislata.jpalibros.c_domain.usecase.interfaces;

import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

public interface PublisherFindByBookIdUseCase {

    Publisher execute(Integer bookId);
}
