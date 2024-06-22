package com.example.guestbook.repository;

import com.example.guestbook.model.Guest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    // Mengurutkan berdasarkan kolom 'id' secara desc
    @Query("SELECT g FROM Guest g ORDER BY g.id DESC")
    List<Guest> findAllOrderByIdDesc();

    // Jika ingin mengurutkan berdasarkan kolom 'name' secara desc
    @Query("SELECT g FROM Guest g ORDER BY g.name DESC")
    List<Guest> findAllOrderByNameDesc();
}