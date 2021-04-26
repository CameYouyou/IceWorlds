package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idClient;
    private String nomClient;
    private String prenomClient;
    private String mailClient;
    private String passwordClient;
    private String adresseClient;
    private int postcodeClient;
    private String villeClient;
    private LocalDate birthClient;

    // CONSTRUCTEUR
    public Client(String nomClient, String prenomClient, String mailClient, String passwordClient, String adresseClient, int postcodeClient, String villeClient, LocalDate birthClient) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.mailClient = mailClient;
        this.passwordClient = passwordClient;
        this.adresseClient = adresseClient;
        this.postcodeClient = postcodeClient;
        this.villeClient = villeClient;
        this.birthClient = birthClient;
    }

    public Client(){}

    // GETTER & SETTER
    public Long getIdClient() {
        return idClient;
    }
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }
    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getMailClient() {
        return mailClient;
    }
    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public String getPasswordClient() {
        return passwordClient;
    }
    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }
    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public int getPostcodeClient() {
        return postcodeClient;
    }
    public void setPostcodeClient(int postcodeClient) {
        this.postcodeClient = postcodeClient;
    }

    public String getVilleClient() {
        return villeClient;
    }
    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }

    public LocalDate getBirthClient() {
        return birthClient;
    }
    public void setBirthClient(LocalDate birthClient) {
        this.birthClient = birthClient;
    }
}
