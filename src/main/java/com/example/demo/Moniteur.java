package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMoniteur;
    private String nomMoniteur;
    private String specialiteMoniteur;

    // CONSTRUCTEUR
    public Moniteur(String nomMoniteur, String specialiteMoniteur) {
        this.nomMoniteur = nomMoniteur;
        this.specialiteMoniteur = specialiteMoniteur;
    }

    public Moniteur (){}

    // GETTER & SETTER
    public Long getIdMoniteur() {
        return idMoniteur;
    }
    public void setIdMoniteur(Long idMoniteur) {
        this.idMoniteur = idMoniteur;
    }

    public String getNomMoniteur() {
        return nomMoniteur;
    }
    public void setNomMoniteur(String nomMoniteur) {
        this.nomMoniteur = nomMoniteur;
    }

    public String getSpecialiteMoniteur() {
        return specialiteMoniteur;
    }
    public void setSpecialiteMoniteur(String specialiteMoniteur) {
        this.specialiteMoniteur = specialiteMoniteur;
    }
}
