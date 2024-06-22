package com.example.guestbook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    // buat halaman akses default
    @GetMapping("")
    public ResponseEntity<?> index() {
        return ResponseEntity.ok().body("Backend program GuestBook");
    }
}
