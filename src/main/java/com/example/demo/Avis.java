package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idAvis;
    private int nbAvis;
    private double scoreAvis;

    // CONSTRUCTEUR
    public Avis(int nbAvis, int scoreAvis) {
        this.nbAvis = nbAvis;
        this.scoreAvis = scoreAvis;
    }

    public Avis(){}

    // GETTER & SETTER
    public Long getIdAvis() {
        return idAvis;
    }
    public void setIdAvis(Long idAvis) {
        this.idAvis = idAvis;
    }

    public int getNbAvis() {
        return nbAvis;
    }
    public void setNbAvis(int nbAvis) {
        this.nbAvis = nbAvis;
    }

    public double getScoreAvis() {
        return scoreAvis;
    }
    public void setScoreAvis(double scoreAvis) {
        this.scoreAvis = scoreAvis;
    }
}
