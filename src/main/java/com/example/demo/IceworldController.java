package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// pour acceder a tous les pors
@CrossOrigin(origins = "*")
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

    @DeleteMapping("deleteresa/{idresa}")
    public void supResa (@PathVariable("idresa") Long idresa){
        iceworldService.supResa(idresa);
    }

    /*@PutMapping("modifresa/{idResa}")
    public void modifResa (@RequestBody Reservation updateResa){
        iceworldService.modifReservation(updateResa);
    }*/

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

    @DeleteMapping("deletelogement/{idloge}")
    public void supLogement (@PathVariable("idloge") Long idloge){
        iceworldService.supLogement(idloge);
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
    public int createAvis (@RequestBody double feedback){
        System.out.println(feedback);
        return iceworldService.addAvis(feedback);
    }
    @GetMapping("afficheravis")
    public int afficherAvis(){
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
    @DeleteMapping("deletemono/{idMono}")
    public void supMono (@PathVariable("idMono") Long idmono){
        iceworldService.supMono(idmono);
    }
}
