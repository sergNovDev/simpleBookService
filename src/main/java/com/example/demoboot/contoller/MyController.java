package com.example.demoboot.contoller;

import com.example.demoboot.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class MyController {
    private final MyService service;

    @GetMapping("/api/v1/books/{id}")
    public ResponseEntity<String> getBook(@PathVariable("id") Long id){
        String res = service.findById(id);
        return ResponseEntity.ok(res);
    }
}
