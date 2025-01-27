package com.fpmislata.tryjpa.b_presentation.admin.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.tryjpa.b_presentation.admin.model.MovieSimple;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;

@Mapper
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    List<MovieSimple> toMovieSimpleList(List<Movie> movies);

    MovieSimple toMovieSimple(Movie movie);
}
