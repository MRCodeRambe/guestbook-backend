package com.example.guestbook.service;

import com.example.guestbook.model.Guest;
import com.example.guestbook.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getAllGuests() {
        // return guestRepository.findAll();
        return guestRepository.findAllOrderByIdDesc(); // Menggunakan metode kustom untuk sorting

    }

    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }
}