package com.fpmislata.repaso.c_domain.usecase.interfaces;


import com.fpmislata.repaso.c_domain.service.model.Book;

public interface BookAdminFindByIsbn {
    
    Book execute(String isbn);
}
