package com.fpmislata.jpalibros.d_persistence.zdao.interfaces;

import java.util.Optional;

import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

public interface PublisherDao {

    Optional<Publisher> findByBookId(Integer bookId);
}
