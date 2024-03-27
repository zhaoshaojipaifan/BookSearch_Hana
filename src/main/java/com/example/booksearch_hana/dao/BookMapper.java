package com.example.booksearching_hana.dao;

import com.example.booksearching_hana.domain.Book;

public interface BookMapper {
    public Book findBookById(Integer id);
}

