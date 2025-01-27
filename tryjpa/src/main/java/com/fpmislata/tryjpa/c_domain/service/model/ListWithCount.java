package com.fpmislata.tryjpa.c_domain.service.model;

import java.util.List;

public record ListWithCount<T>(
        List<T> list,
        Long count) {
} 
