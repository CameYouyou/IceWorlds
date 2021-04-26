package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IceworldService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    AttractionRepository attractionRepository;
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    LogementRepository logementRepository;

    public void addClient(Client newClient){
        clientRepository.save(newClient);
    }

    public List<Client> recupeClient() {
        return clientRepository.findAll();
    }

    public void addReservation(Reservation newResa){
        reservationRepository.save(newResa);
    }

    public List<Reservation> recupeResa() {
        return reservationRepository.findAll();
    }

    public void addLogement(Logement newLogement){
        logementRepository.save(newLogement);
    }

    public List<Logement> recupeLogement() {
        return logementRepository.findAll();
    }
}
