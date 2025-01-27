package com.fpmislata.tryjpa.b_presentation.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.tryjpa.b_presentation.admin.mapper.MovieMapper;
import com.fpmislata.tryjpa.b_presentation.admin.model.MovieSimple;
import com.fpmislata.tryjpa.b_presentation.common.Paginator;
import com.fpmislata.tryjpa.c_domain.service.model.ListWithCount;
import com.fpmislata.tryjpa.c_domain.service.model.Movie;
import com.fpmislata.tryjpa.c_domain.usecase.common.movie.interfaces.MovieFindAllUseCase;
import com.fpmislata.tryjpa.c_domain.usecase.common.movie.interfaces.MovieFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(MovieController.ENDPOINT)
public class MovieController {

    private final MovieFindAllUseCase movieFindAllUseCase;
    private final MovieFindByIdUseCase movieFindByIdUseCase;

    @Value("${url}")
    private String URL;
    public static final String ENDPOINT = "api/movies";

    @GetMapping()
    public ResponseEntity<Paginator<MovieSimple>> findAll(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size) {

        ListWithCount<Movie> movieListWithCount = movieFindAllUseCase.execute(page - 1, size);
        List<MovieSimple> movieSimpleList = MovieMapper.INSTANCE.toMovieSimpleList(movieListWithCount.list());
        Paginator<MovieSimple> paginator = new Paginator<>(movieSimpleList, movieListWithCount.count(), page, size,
                URL + ENDPOINT);

        return ResponseEntity.ok(paginator);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieSimple> findById(@PathVariable Integer id) {
        Movie movie = movieFindByIdUseCase.execute(id);
        MovieSimple movieSimple = MovieMapper.INSTANCE.toMovieSimple(movie);

        return new ResponseEntity<>(movieSimple, HttpStatus.CREATED);
    }

    @PostMapping()
    public ResponseEntity<MovieSimple> create(@RequestBody Movie movie) {
        Movie movieCreated = movieFindByIdUseCase.execute(movie.getId());
        MovieSimple movieSimple = MovieMapper.INSTANCE.toMovieSimple(movieCreated);

        return new ResponseEntity<>(movieSimple, HttpStatus.CREATED);
    }
}
