package com.enesceylan.library.Repository;

import com.enesceylan.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {

}