package com.example.libraryreservesserver.repositories;

import com.example.libraryreservesserver.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
    @Query("SELECT book FROM Book book")
    public List<Book> findAllBooks();

    @Query("SELECT book FROM Book book WHERE book.course.id=:courseId")
    public List<Book> findBooksForCourse(
            @Param("courseId") Integer courseId);

    @Query("SELECT book FROM Book book WHERE book.id=:bookId")
    public Book findBookById(
            @Param("bookId") Integer bookId);
}
