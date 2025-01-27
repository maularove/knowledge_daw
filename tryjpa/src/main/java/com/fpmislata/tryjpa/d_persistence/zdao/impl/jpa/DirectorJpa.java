package com.fpmislata.tryjpa.d_persistence.zdao.impl.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpmislata.tryjpa.d_persistence.zdao.impl.model.DirectorDaoModel;

public interface DirectorJpa extends JpaRepository<DirectorDaoModel, Integer> {

    @Query(value = "SELECT d.* FROM Director d " +
            "JOIN Movie m ON m.director_id = d.id" +
            "WHERE m.id = :id", nativeQuery = true)

    Optional<DirectorDaoModel> findDirectorByMovieId(int id);
}
