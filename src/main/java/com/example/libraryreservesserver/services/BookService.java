package com.example.libraryreservesserver.services;

import com.example.libraryreservesserver.models.Book;
import com.example.libraryreservesserver.models.Course;
import com.example.libraryreservesserver.repositories.BookRepository;
import com.example.libraryreservesserver.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookRepository bookRepository;

    // CREATE operations
    public Book createBook(Integer courseId, Book newBook) {
        Course course = courseRepository.findCourseById(courseId);
        newBook.setCourse(course);
        return bookRepository.save(newBook);
    }

    // READ operations
    public List<Book> findAllBooks() {
        return bookRepository.findAllBooks();
    }

    public List<Book> findBooksForCourse(Integer courseId) {
        return bookRepository.findBooksForCourse(courseId);
    }

    public Book findBookById(Integer bookId) {
        return bookRepository.findBookById(bookId);
    }

    // UPDATE operations
    public Book updateBook(Integer bookId, Book updatedBook) {
        Book book = bookRepository.findBookById(bookId);
        book.setCourse(updatedBook.getCourse());
        bookRepository.save(book);
        return book;
    }

    // DELETE operations
    public List<Book> deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
        List<Book> result = new ArrayList<Book>();
        return result;
    }
}
