package com.fpmislata.jpalibros.c_domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.fpmislata.jpalibros.c_domain.service.interfaces.PublisherService;
import com.fpmislata.jpalibros.c_domain.service.model.Publisher;
import com.fpmislata.jpalibros.c_domain.usecase.interfaces.PublisherFindByBookIdUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublisherFindByBookIdUseCaseImpl implements PublisherFindByBookIdUseCase {

    private final PublisherService publisherService;

    @Override
    public Publisher execute(Integer bookId) {
        return publisherService.findByBookId(bookId)
                .orElseThrow(() -> new RuntimeException("Publisher not found"));
    }
}
