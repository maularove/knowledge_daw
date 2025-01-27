package com.fpmislata.jpalibros.c_domain.service.interfaces;

import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

public interface PublisherService {

    Optional<Publisher> findByBookId(Integer bookId);
}
