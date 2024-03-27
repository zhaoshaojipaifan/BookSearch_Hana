package com.example.booksearching_hana.controller;

import com.example.booksearching_hana.domain.Book;
import com.example.booksearching_hana.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    public ModelAndView findBookById(Integer id) {
        Book book = bookService.findBookById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book.jsp");
        modelAndView.addObject("book", book);
        return modelAndView;
    }
}

