package com.example.booksearching_hana.service.impl;

import com.example.booksearching_hana.dao.BookMapper;
import com.example.booksearching_hana.domain.Book;
import com.example.booksearching_hana.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}

