package com.telecomacademy.curs6.Exemplu1.services;

import com.telecomacademy.curs6.Exemplu1.repositories.BookRepository;
import org.springframework.stereotype.Service;
import com.telecomacademy.curs6.Exemplu1.model.Book;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public int addBooks(Book book){ return bookRepository.addBook(book);};
    public List<Book> getBooks(){
        return bookRepository.getBooks();
    }
}


