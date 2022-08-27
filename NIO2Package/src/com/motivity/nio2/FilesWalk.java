package com.motivity.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWalk {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src");
        Files.walk(path).forEach(System.out::println);
        System.out.println("stream paths");
        Files.walk(path, 0).forEach(System.out::println);
        if (Files.isRegularFile(path)) {
            Files.lines(path).forEach(System.out::println);
        }
        String name = Files.getOwner(path).getName();//A user principal representing the owner of the file
        System.out.println(name);
    }
}
