package com.fpmislata.jpalibros.d_persistence.zdao.impl.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.PublisherDaoModel;

public interface PublisherJpa extends JpaRepository<PublisherDaoModel, Integer> {

    @Query(value = "SELECT p.* FROM publishers p " +
            "JOIN books b ON b.publisher_id = p.id " +
            "WHERE b.id = :id", nativeQuery = true)

    Optional<PublisherDaoModel> findByMovieId(Integer id);
}
