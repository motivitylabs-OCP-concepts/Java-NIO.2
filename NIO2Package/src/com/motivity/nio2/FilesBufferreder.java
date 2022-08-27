package com.motivity.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesBufferreder {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");



        if (!Files.exists(path)){
            Files.createFile(path);
        }
        BufferedReader reader = Files.newBufferedReader(path);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }
}

