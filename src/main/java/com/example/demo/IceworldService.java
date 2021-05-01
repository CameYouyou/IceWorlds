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

    // Client
    public void addClient(Client newClient){
        clientRepository.save(newClient);
    }
    public List<Client> recupeClient() {
        return clientRepository.findAll();
    }

    // Reservation
    public void addReservation(Reservation newResa){
        reservationRepository.save(newResa);
    }
    public List<Reservation> recupeResa() {
        return reservationRepository.findAll();
    }
    public void supResa (Long idresa){
        reservationRepository.deleteById(idresa);
    }
    //public void modifReservation(Reservation modifResa){
    //    reservationRepository.save(modifResa);
    //}

    // Logement
    public void addLogement(Logement newLogement){
        logementRepository.save(newLogement);
    }
    public List<Logement> recupeLogement() {
        return logementRepository.findAll();
    }
    public void supLogement (Long idloge){
        logementRepository.deleteById(idloge);
    }

    // Attraction
    public void addAttraction(Attraction newAttraction){
        attractionRepository.save(newAttraction);
    }
    public List<Attraction> recupeAttraction() {
        return attractionRepository.findAll();
    }

    // Event
    public void addEvent(Event newEvent){
        eventRepository.save(newEvent);
    }
    public List<Event> recupeEvent() {
        return eventRepository.findAll();
    }

    // Avis
    public int addAvis(double feedback){
        Avis avis = avisRepository.findById(1L).get();
        int newNb = avis.getNbAvis() + 1;
        double newScore = avis.getScoreAvis() + feedback;
        avis.setNbAvis(newNb);
        avis.setScoreAvis(newScore);
        int percent =(int) (newScore/newNb) * 100;
        avisRepository.save(avis);
        return percent;
    }
    public int recupeAvis() {
        Avis avis = avisRepository.findById(1L).get();
        int nb = avis.getNbAvis();
        double score = avis.getScoreAvis();
        int percent =(int) (score/nb) * 100;
        return percent;
    }

    // Mono
    public void addMono(Moniteur newMono){
        moniteurRepository.save(newMono);
    }
    public List<Moniteur> recupeMono() {
        return moniteurRepository.findAll();
    }
    public void supMono (Long idmono){
        moniteurRepository.deleteById(idmono);
    }
}
