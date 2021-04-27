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
    @Autowired
    EventRepository eventRepository;
    @Autowired
    AvisRepository avisRepository;
    @Autowired
    MoniteurRepository moniteurRepository;

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

    public void addAttraction(Attraction newAttraction){
        attractionRepository.save(newAttraction);
    }
    public List<Attraction> recupeAttraction() {
        return attractionRepository.findAll();
    }

    public void addEvent(Event newEvent){
        eventRepository.save(newEvent);
    }
    public List<Event> recupeEvent() {
        return eventRepository.findAll();
    }

    public void addAvis(Avis newAvis){
        avisRepository.save(newAvis);
    }
    public List<Avis> recupeAvis() {
        return avisRepository.findAll();
    }

    public void addMono(Moniteur newMono){
        moniteurRepository.save(newMono);
    }
    public List<Moniteur> recupeMono() {
        return moniteurRepository.findAll();
    }
}
