package com.example.booksearching_hana.service;

import com.example.booksearching_hana.domain.Book;

public interface BookService {
    public Book findBookById(Integer id);
}

