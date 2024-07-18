package com.telecomacademy.curs6.Exemplu1.controllers;

import com.telecomacademy.curs6.Exemplu1.model.Book;
import com.telecomacademy.curs6.Exemplu1.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public List<Book> getBook(){
        return  bookService.getBooks();
    }

    @PostMapping(path="/add")
    public int addBook(@RequestBody Book book){
        return  bookService.addBooks(book);
    }

}
