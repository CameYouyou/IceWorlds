package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idEvent;
    private String nomEvent;
    private LocalDate dstartEvent;
    private LocalTime hstartEvent;
    private LocalDate dendEvent;
    private LocalTime hendEvent;
    private String detailEvent;
    private String lieuEvent;

    // CONSTRUCTEUR
    public Event(String nomEvent, LocalDate dstartEvent, LocalTime hstartEvent, LocalDate dendEvent, LocalTime hendEvent, String detailEvent, String lieuEvent) {
        this.nomEvent = nomEvent;
        this.dstartEvent = dstartEvent;
        this.hstartEvent = hstartEvent;
        this.dendEvent = dendEvent;
        this.hendEvent = hendEvent;
        this.detailEvent = detailEvent;
        this.lieuEvent = lieuEvent;
    }

    public Event (){}

    // GETTER & SETTER
    public Long getIdEvent() {
        return idEvent;
    }
    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public String getNomEvent() {
        return nomEvent;
    }
    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public LocalDate getDstartEvent() {
        return dstartEvent;
    }
    public void setDstartEvent(LocalDate dstartEvent) {
        this.dstartEvent = dstartEvent;
    }

    public LocalTime getHstartEvent() {
        return hstartEvent;
    }
    public void setHstartEvent(LocalTime hstartEvent) {
        this.hstartEvent = hstartEvent;
    }

    public LocalDate getDendEvent() {
        return dendEvent;
    }
    public void setDendEvent(LocalDate dendEvent) {
        this.dendEvent = dendEvent;
    }

    public LocalTime getHendEvent() {
        return hendEvent;
    }
    public void setHendEvent(LocalTime hendEvent) {
        this.hendEvent = hendEvent;
    }

    public String getDetailEvent() {
        return detailEvent;
    }
    public void setDetailEvent(String detailEvent) {
        this.detailEvent = detailEvent;
    }

    public String getLieuEvent() {
        return lieuEvent;
    }
    public void setLieuEvent(String lieuEvent) {
        this.lieuEvent = lieuEvent;
    }
}
