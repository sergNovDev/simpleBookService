package com.example.demoboot.service;

import com.example.demoboot.model.Book;
import com.example.demoboot.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyService {
    private final MyRepository myRepository;

    public String findById(Long id){
        Optional<Book> book = myRepository.findById(id);
        return book.map(Book::getTitle).orElseThrow(()->new RuntimeException("Не нашли по id=" + id));
    }
}
