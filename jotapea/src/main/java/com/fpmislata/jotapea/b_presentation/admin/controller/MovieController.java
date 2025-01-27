package com.fpmislata.jotapea.b_presentation.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.jotapea.b_presentation.admin.mapper.DirectorMapper;
import com.fpmislata.jotapea.b_presentation.admin.mapper.MovieMapper;
import com.fpmislata.jotapea.b_presentation.admin.model.DirectorSimple;
import com.fpmislata.jotapea.b_presentation.admin.model.MovieSimple;
import com.fpmislata.jotapea.b_presentation.common.Paginator;
import com.fpmislata.jotapea.c_domain.service.model.Director;
import com.fpmislata.jotapea.c_domain.service.model.ListWithCount;
import com.fpmislata.jotapea.c_domain.service.model.Movie;
import com.fpmislata.jotapea.c_domain.usecase.common.director.interfaces.DirectorFindByMovieIdUseCase;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieFindAllUseCase;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieFindByIdUseCase;
import com.fpmislata.jotapea.c_domain.usecase.common.movie.interfaces.MovieGetAllUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(MovieController.ENDPOINT)
public class MovieController {

    // private final MovieFindAllUseCase movieFindAllUseCase;
    private final MovieGetAllUseCase movieGetAllUseCase;
    private final MovieFindByIdUseCase movieFindByIdUseCase;
    private final DirectorFindByMovieIdUseCase directorFindByMovieIdUseCase;

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "api/movies";

    // @GetMapping()
    // public ResponseEntity<Paginator<MovieSimple>> findAll(
    // @RequestParam(defaultValue = "1") Integer page,
    // @RequestParam(required = false, defaultValue = "10") Integer size) {

    // ListWithCount<Movie> movieListWithCount = movieFindAllUseCase.execute(page -
    // 1, size);
    // List<MovieSimple> movieSimpleList =
    // MovieMapper.INSTANCE.toMovieSimpleList(movieListWithCount.list());
    // Paginator<MovieSimple> paginator = new Paginator<>(movieSimpleList,
    // movieListWithCount.count(), page, size,
    // URL + ENDPOINT);

    // return ResponseEntity.ok(paginator);
    // }

    @GetMapping()
    public List<MovieSimple> findAll() {
        List<Movie> movies = movieGetAllUseCase.execute();
        return MovieMapper.INSTANCE.toMovieSimpleList(movies);
    }

    // es con PATH_VARIABLE
    @GetMapping("/{id}")
    public MovieSimple findById(@PathVariable Integer id) {
        Movie movies = movieFindByIdUseCase.execute(id);
        return MovieMapper.INSTANCE.toMovieSimple(movies);
    }

    @GetMapping("/{id}/directors")
    public DirectorSimple findAllByMovieId(@PathVariable Integer id) {
        Director director = directorFindByMovieIdUseCase.execute(id);
        return DirectorMapper.INSTANCE.toDirectorSimple(director);
    }
}
