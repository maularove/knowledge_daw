package com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.AuthorDaoModel;

public interface AuthorJpa extends JpaRepository<AuthorDaoModel, Integer> {
}
