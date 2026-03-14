package com.enesceylan.library.controller;

import com.enesceylan.library.Service.BookService;
import com.enesceylan.library.dto.BookRequest;
import com.enesceylan.library.entity.Book;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("")
    public List<Book>  getAllBooks(){
        return bookService.findAll();
    }

    @PostMapping("")
    public Book saveBook(@RequestBody BookRequest book){
        return bookService.save(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody BookRequest book){
        return bookService.update(id, book);
    }
}

