package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String idImage;
    private String nomImage;
    private String typeImage;
    @Lob
    private byte[] photoImage;
    // Liens
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_attraction")
    private Attraction attraction;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_event")
    private Event event;

    // CONSTRUCTEUR
    public Image(String nomImage, String typeImage, byte[] photoImage, Attraction attraction, Event event) {
        this.nomImage = nomImage;
        this.typeImage = typeImage;
        this.photoImage = photoImage;
        this.attraction = attraction;
        this.event = event;
    }
    public Image(String nomImage, String typeImage, byte[] photoImage) {
        this.nomImage = nomImage;
        this.typeImage = typeImage;
        this.photoImage = photoImage;
    }

    public Image(){}

    // GETTER & SETTER
    public String getIdImage() {
        return idImage;
    }
    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public String getNomImage() {
        return nomImage;
    }
    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public String getTypeImage() {
        return typeImage;
    }
    public void setTypeImage(String typeImage) {
        this.typeImage = typeImage;
    }

    public byte[] getPhotoImage() {
        return photoImage;
    }
    public void setPhotoImage(byte[] photoImage) {
        this.photoImage = photoImage;
    }

    public Attraction getAttraction() {
        return attraction;
    }
    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
}

