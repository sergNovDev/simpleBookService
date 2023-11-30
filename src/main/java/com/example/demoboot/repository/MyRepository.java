package com.example.demoboot.repository;

import com.example.demoboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Book,Long> {
}
