package com.motivity.nio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFilePath {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("src/test.txt");
        if (!Files.exists(p1)){
            Files.createFile(p1);
        }
        Path p2 = Paths.get("src/test6.txt");
        Files.copy(p1, p2);//the path to the target file
        System.out.println("copied success");
        //new location of the file
        Path p4 = Paths.get("src/test4");
        //the name of the file in the new location
        Path p3 = Paths.get("src/test.txt");
        //create the new location if not exists
        if (!Files.exists(p4)){
            Files.createDirectories(p4);
        }
        //moving the file
        Files.move(p1, p3);

        Files.delete(p3);
}
}
