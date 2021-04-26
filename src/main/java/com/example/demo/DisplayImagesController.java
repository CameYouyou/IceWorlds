package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class DisplayImagesController {

    @Autowired
    StorageService fileStorageService;

    @GetMapping("/displayimages")
    public ModelAndView displayImages() {

        ModelAndView view = new ModelAndView("displayImages");

        view.addObject("image_id", fileStorageService.getAllFiles().get(0).getIdImage());

        return view;
    }

    /* Cette méthode retourne une image stockée en BD */
    @GetMapping(value = "/image/{image_id}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable("image_id") String imageId) throws IOException {

        // get image from DAO based on id:
        // byte[] imageContent =
        // fileStorageService.getFile("7a43d0ba-c103-4de8-88f4-922b71207d89").getData();
        byte[] imageContent = fileStorageService.getFile(imageId).getPhotoImage();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
    }
}
