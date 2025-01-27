package com.fpmislata.jpalibros.c_domain.repository;

import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

public interface PublisherRepository {

    Optional<Publisher> findByBookId(Integer bookId);
}
