package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idAttraction;
    private String nomAttraction;
    private int capaciteAttraction;
    private String materielAttraction;
    private String descriptifAttraction;

    // CONSTRUCTEUR
    public Attraction(String nomAttraction, int capaciteAttraction, String materielAttraction, String descriptifAttraction) {
        this.nomAttraction = nomAttraction;
        this.capaciteAttraction = capaciteAttraction;
        this.materielAttraction = materielAttraction;
        this.descriptifAttraction = descriptifAttraction;
    }

    public Attraction (){}

    // GETTER & SETTER
    public Long getIdAttraction() {
        return idAttraction;
    }
    public void setIdAttraction(Long idAttraction) {
        this.idAttraction = idAttraction;
    }

    public String getNomAttraction() {
        return nomAttraction;
    }
    public void setNomAttraction(String nomAttraction) {
        this.nomAttraction = nomAttraction;
    }

    public int getCapaciteAttraction() {
        return capaciteAttraction;
    }
    public void setCapaciteAttraction(int capaciteAttraction) {
        this.capaciteAttraction = capaciteAttraction;
    }

    public String getMaterielAttraction() {
        return materielAttraction;
    }
    public void setMaterielAttraction(String materielAttraction) {
        this.materielAttraction = materielAttraction;
    }

    public String getDescriptifAttraction() {
        return descriptifAttraction;
    }
    public void setDescriptifAttraction(String descriptifAttraction) {
        this.descriptifAttraction = descriptifAttraction;
    }
}
