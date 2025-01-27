package com.fpmislata.finaljpa.persistence.zdao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.finaljpa.persistence.zdao.impl.model.AuthorDaoEntity;

public interface AuthorJpa extends JpaRepository<AuthorDaoEntity, Integer> {
}
