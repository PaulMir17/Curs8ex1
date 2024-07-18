package com.telecomacademy.curs6.Exemplu1.repositories;

import com.telecomacademy.curs6.Exemplu1.model.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Create

    public int addBook(Book book){
        String sql="Insert into books(title,price) Values(?,?)";

        return jdbcTemplate.update(sql,book.getTitle(),book.getPrice());  // sql, e sql-ul de mai sus, primul paramentru ?, al 2lea paramentru ? din codul sql
    }
    //Read

    public List<Book> getBooks(){

        return jdbcTemplate.query("Select * FROM Books", new BeanPropertyRowMapper<>(Book.class));  // se da SQL-ul si se converteste rezultatul la "Book.class"
    }

    //Update

    //Delete
}
