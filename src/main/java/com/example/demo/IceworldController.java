package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    // Logement
    @PostMapping("ajoutlogement")
    public void createLogement (@RequestBody Logement newLogement){
        iceworldService.addLogement(newLogement);
        System.out.println(newLogement.getIdLogement());
    }

    @GetMapping("afficherlogement")
    public List<Logement> afficherlogement(){
        return iceworldService.recupeLogement();
    }
}
