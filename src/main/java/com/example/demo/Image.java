package com.example.demo;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idImage;
    private String nomImage;
    private String typeImage;
    @Lob
    private byte[] photoImage;

    // CONSTRUCTEUR
    public Image(String nomImage, String typeImage, byte[] photoImage) {
        this.nomImage = nomImage;
        this.typeImage = typeImage;
        this.photoImage = photoImage;
    }

    public Image(){}

    // GETTER & SETTER
    public Long getIdImage() {
        return idImage;
    }
    public void setIdImage(Long idImage) {
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
}

