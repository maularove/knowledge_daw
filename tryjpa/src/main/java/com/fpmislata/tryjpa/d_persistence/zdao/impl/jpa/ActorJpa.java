package com.fpmislata.tryjpa.d_persistence.zdao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpmislata.tryjpa.d_persistence.zdao.impl.model.ActorDaoModel;

public interface ActorJpa extends JpaRepository<ActorDaoModel, Integer> {

    @Query(value = "SELECT a.* FROM Actor a " +
            "JOIN MovieActor ma ON a.id = ma.ActorId " +
            "WHERE ma.MovieId = :id", nativeQuery = true)

    List<ActorDaoModel> findActorsByMovieId(Integer id);
}
