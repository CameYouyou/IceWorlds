package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

@Service
public class StorageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Image image = new Image(fileName, file.getContentType(), file.getBytes());

        return imageRepository.save(image);
    }

    public Image getFile(String id) {
        return imageRepository.findById(id).get();
    }

    public List<Image> getAllFiles() {
        return imageRepository.findAll();
    }

    public Stream<Image> getAllFilesStream() {
        return imageRepository.findAll().stream();
    }
}