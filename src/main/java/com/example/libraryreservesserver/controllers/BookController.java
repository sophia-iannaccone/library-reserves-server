package com.example.libraryreservesserver.controllers;

import com.example.libraryreservesserver.models.Book;
import com.example.libraryreservesserver.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
    BookService bookService;

    // CREATE operations
    @PostMapping("/api/courses/{courseId}/books")
    public Book createBook(
            @PathVariable("courseId") Integer courseId,
            @RequestBody Book newBook) {
        return bookService.createBook(courseId, newBook);
    }

    // READ operations
    @GetMapping("/api/books")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/api/courses/{courseId}/books")
    public List<Book> findBooksForCourse(
            @PathVariable("courseId") Integer courseId) {
        return bookService.findBooksForCourse(courseId);
    }

    @GetMapping("/api/books/{bookId}")
    public Book findBookById(
            @PathVariable("bookId") Integer bookId) {
        return bookService.findBookById(bookId);
    }

    // UPDATE operations
    @PutMapping("/api/books/{bookId}")
    public Book updateBook(
            @PathVariable("bookId") Integer bookId,
            @RequestBody Book updatedBook) {
        return bookService.updateBook(bookId, updatedBook);
    }

    // DELETE operations
    @DeleteMapping("/api/books/{bookId}")
    public List<Book> deleteBook(
            @PathVariable("bookId") Integer bookId) {
        return bookService.deleteBook(bookId);
    }
}
