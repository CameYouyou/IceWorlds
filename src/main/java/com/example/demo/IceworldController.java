package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IceworldController {

    @Autowired
    IceworldService iceworldService;

    // Client
    @PostMapping("ajoutclient")
    public void createClient(@RequestBody Client newClient){
        iceworldService.addClient(newClient);
        System.out.println(newClient.getNomClient());
    }

    @GetMapping("afficherclients")
    @CrossOrigin(origins = "*")
    public List<Client> afficherclients(){
        return iceworldService.recupeClient();
    }

    // Reservation
    @PostMapping("ajoutresa")
    public void createResa (@RequestBody Reservation newResa){
        iceworldService.addReservation(newResa);
        System.out.println(newResa.getIdReservation());
    }

    @GetMapping("afficherresa")
    public List<Reservation> afficherresa(){
        return iceworldService.recupeResa();
    }

    // Logements
    @PostMapping("ajoutlogement")
    public void createLogement (@RequestBody Logement newLogement){
        iceworldService.addLogement(newLogement);
        System.out.println(newLogement.getIdLogement());
    }

    @GetMapping("afficherlogement")
    public List<Logement> afficherlogement(){
        return iceworldService.recupeLogement();
    }

    // Attractions
    @PostMapping("ajoutattraction")
    public void createAttraction (@RequestBody Attraction newAttraction){
        iceworldService.addAttraction(newAttraction);
        System.out.println(newAttraction.getIdAttraction());
    }
    @GetMapping("afficherattraction")
    public List<Attraction> afficherAttraction(){
        return iceworldService.recupeAttraction();
    }

    // Evenements
    @PostMapping("ajoutevent")
    public void createEvent (@RequestBody Event newEvent){
        iceworldService.addEvent(newEvent);
        System.out.println(newEvent.getIdEvent());
    }
    @GetMapping("afficherevent")
    public List<Event> afficherEvent(){
        return iceworldService.recupeEvent();
    }

    // Avis
    @PostMapping("ajoutavis")
    public void createAvis (@RequestBody Avis newAvis){
        iceworldService.addAvis(newAvis);
        System.out.println(newAvis.getIdAvis());
    }
    @GetMapping("afficheravis")
    public List<Avis> afficherAvis(){
        return iceworldService.recupeAvis();
    }

    // Moniteur
    @PostMapping("ajoutmoniteur")
    public void createMono (@RequestBody Moniteur newMono){
        iceworldService.addMono(newMono);
        System.out.println(newMono.getIdMoniteur());
    }
    @GetMapping("affichermoniteur")
    public List<Moniteur> afficherMono(){
        return iceworldService.recupeMono();
    }
}
