package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReservation;
    @Column(name = "nb_personne")
    private int nbReservation;
    private LocalDate startReservation;
    private LocalDate endReservation;
    // Liens
    // @ManyToOne(cascade = {CascadeType.ALL})
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    @ManyToMany
    @JoinTable(name = "avoir", joinColumns = @JoinColumn(name = "id_logement"),inverseJoinColumns = @JoinColumn(name = "id_reservation"))
    private List<Logement> logements;

    // CONSTRUCTEUR
    public Reservation(int nbReservation, LocalDate startReservation, LocalDate endReservation, Client client, List<Logement> logements) {
        this.nbReservation = nbReservation;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
        this.client = client;
        this.logements = logements;
    }

    public Reservation(){}

    // GETTER & SETTER
    public Long getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public int getNbReservation() {
        return nbReservation;
    }
    public void setNbReservation(int nbReservation) {
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

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<Logement> getLogements() {
        return logements;
    }
    public void setLogements(List<Logement> logements) {
        this.logements = logements;
    }
}
