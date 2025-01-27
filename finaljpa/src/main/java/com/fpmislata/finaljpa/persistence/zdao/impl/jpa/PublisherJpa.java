package com.fpmislata.finaljpa.persistence.zdao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.finaljpa.persistence.zdao.impl.model.PublisherDaoEntity;

public interface PublisherJpa extends JpaRepository<PublisherDaoEntity, Integer> {
}