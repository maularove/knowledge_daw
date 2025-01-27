package com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.GenreDaoModel;

public interface GenreJpa extends JpaRepository<GenreDaoModel, Integer> {
}
