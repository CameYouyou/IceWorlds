package com.example.demo;

import javax.persistence.*;

@Entity
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idAttraction;
    private String nomAttraction;
    private int ageAttraction;
    private String descriptifAttraction;
    // Liens
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_moniteur")
    private Moniteur moniteur;
   // @ManyToOne(cascade = {CascadeType.ALL})
    @ManyToOne
    @JoinColumn(name = "id_image")
    private Image image;

    // CONSTRUCTEUR
    public Attraction(String nomAttraction, int ageAttraction, String descriptifAttraction, Moniteur moniteur,Image image) {
        this.nomAttraction = nomAttraction;
        this.ageAttraction = ageAttraction;
        this.descriptifAttraction = descriptifAttraction;
        this.moniteur = moniteur;
        this.image = image;
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

    public int getAgeAttraction() {
        return ageAttraction;
    }
    public void setAgeAttraction(int ageAttraction) {
        this.ageAttraction = ageAttraction;
    }

    public String getDescriptifAttraction() {
        return descriptifAttraction;
    }
    public void setDescriptifAttraction(String descriptifAttraction) {
        this.descriptifAttraction = descriptifAttraction;
    }

    public Moniteur getMoniteur() {
        return moniteur;
    }
    public void setMoniteur(Moniteur moniteur) {
        this.moniteur = moniteur;
    }

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
}
