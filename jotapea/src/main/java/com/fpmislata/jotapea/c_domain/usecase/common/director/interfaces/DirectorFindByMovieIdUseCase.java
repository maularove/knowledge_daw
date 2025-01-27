package com.fpmislata.jotapea.c_domain.usecase.common.director.interfaces;

import com.fpmislata.jotapea.c_domain.service.model.Director;

public interface DirectorFindByMovieIdUseCase {

    Director execute(Integer movieId);
}
