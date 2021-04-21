package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReservation;
    private String nbReservation;
    private LocalDate startReservation;
    private LocalDate endReservation;

    // CONSTRUCTEUR
    public Reservation(String nbReservation, LocalDate startReservation, LocalDate endReservation) {
        this.nbReservation = nbReservation;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
    }
    public Reservation(){}

    // GETTER & SETTER
    public Long getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public String getNbReservation() {
        return nbReservation;
    }
    public void setNbReservation(String nbReservation) {
        this.nbReservation = nbReservation;
    }

    public LocalDate getStartReservation() {
        return startReservation;
    }
    public void setStartReservation(LocalDate startReservation) {
        this.startReservation = startReservation;
    }

    public LocalDate getEndReservation() {
        return endReservation;
    }
    public void setEndReservation(LocalDate endReservation) {
        this.endReservation = endReservation;
    }
}
