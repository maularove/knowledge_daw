package com.fpmislata.jpalibros.d_persistence.repositoryImpl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.jpalibros.c_domain.repository.PublisherRepository;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;
import com.fpmislata.jpalibros.d_persistence.zdao.interfaces.PublisherDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PublisherRepositoryImpl implements PublisherRepository {

    private final PublisherDao publisherDao;

    @Override
    public Optional<Publisher> findByBookId(Integer bookId) {
        return publisherDao.findByBookId(bookId);
    }
}
