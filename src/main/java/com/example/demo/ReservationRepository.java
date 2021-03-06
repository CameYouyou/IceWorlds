package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    //JPQL Query
    //@Query("SELECT r FROM Reservation r WHERE r.client.nomClient = :nomClient")
    //List<Reservation> findAllByNom(@Param("nomClient") String nomClient);
}