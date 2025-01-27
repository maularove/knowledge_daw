package com.fpmislata.repaso.b_presentation.model;

public record BookCollection(
        Long id,
        String isbn,
        String titleEs,
        String synopsisEs,
        String cover,
        Double price,
        Double discount) {
}
