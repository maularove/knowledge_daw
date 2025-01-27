package com.fpmislata.repaso.c_domain.usecase.interfaces;

import java.util.List;

import com.fpmislata.repaso.c_domain.service.model.Book;

public interface BookAdminGetAll {

    List<Book> execute();
}
