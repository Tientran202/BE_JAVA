package com.example.demo1Inteliij.demoSpring;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IStorageService {
    public String storeFile(MultipartFile file);

    public Stream<Path> loadAll();

    public byte[] readFileContent(String fileName);

    public void deleteAllFile();
}
