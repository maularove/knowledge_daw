package com.fpmislata.tryjpa.d_persistence.zdao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.tryjpa.d_persistence.zdao.impl.model.MovieDaoModel;

public interface MovieJpa extends JpaRepository<MovieDaoModel, Integer> {
}
