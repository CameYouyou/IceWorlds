package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Logement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idLogement;
    private String styleLogement;
    private int capaciteLogement;
    private int numeroLogement;
    private float prixLogement;
    // Liens
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "avoir", joinColumns = @JoinColumn(name = "id_reservation"),inverseJoinColumns = @JoinColumn(name = "id_logement"))
    private List<Reservation> reservation;

    // CONSTRUCTEUR
    public Logement(String styleLogement, int capaciteLogement, int numeroLogement, float prixLogement, List<Reservation> reservation) {
        this.styleLogement = styleLogement;
        this.capaciteLogement = capaciteLogement;
        this.numeroLogement = numeroLogement;
        this.prixLogement = prixLogement;
        this.reservation = reservation;
    }

    public Logement(){}

    // GETTER & SETTER
    public Long getIdLogement() {
        return idLogement;
    }
    public void setIdLogement(Long idLogement) {
        this.idLogement = idLogement;
    }

    public String getStyleLogement() {
        return styleLogement;
    }
    public void setStyleLogement(String styleLogement) {
        this.styleLogement = styleLogement;
    }

    public int getCapaciteLogement() {
        return capaciteLogement;
    }
    public void setCapaciteLogement(int capaciteLogement) {
        this.capaciteLogement = capaciteLogement;
    }

    public int getNumeroLogement() {
        return numeroLogement;
    }
    public void setNumeroLogement(int numeroLogement) {
        this.numeroLogement = numeroLogement;
    }

    public float getPrixLogement() {
        return prixLogement;
    }
    public void setPrixLogement(float prixLogement) {
        this.prixLogement = prixLogement;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }
    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }
}
