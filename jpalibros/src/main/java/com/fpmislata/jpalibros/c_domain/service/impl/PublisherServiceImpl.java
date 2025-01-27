package com.fpmislata.jpalibros.c_domain.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.repository.PublisherRepository;
import com.fpmislata.jpalibros.c_domain.service.interfaces.PublisherService;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    @Override
    public Optional<Publisher> findByBookId(Integer bookId) {
        return publisherRepository.findByBookId(bookId);
    }
}
