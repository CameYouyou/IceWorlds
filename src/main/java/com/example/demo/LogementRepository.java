package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LogementRepository extends JpaRepository<Logement, Long> {
    //JPQL Query
    //@Query("SELECT l FROM Logement WHERE l. = :ville")
   // List<Logement> findAllFree();
}
