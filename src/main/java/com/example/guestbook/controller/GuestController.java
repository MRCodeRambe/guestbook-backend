package com.example.guestbook.controller;

import com.example.guestbook.model.Guest;
import com.example.guestbook.repository.GuestRepository;
import com.example.guestbook.service.GuestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public Guest saveGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }
}
