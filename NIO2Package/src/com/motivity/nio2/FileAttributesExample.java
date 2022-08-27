package com.motivity.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileAttributesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");
        FileTime oldTime = Files.getLastModifiedTime(path);
        System.out.println(oldTime);
        Files.setLastModifiedTime(
                path, FileTime.from(Instant.now())
        );
        FileTime n = Files.getLastModifiedTime(path);
        System.out.println(n);
        BasicFileAttributes attr = Files
                .readAttributes(
                        path,
                        BasicFileAttributes.class
                );
        //output some basic atrribute:
        System.out.print("Creation time: ");
        System.out.println(attr.creationTime());
        //output some basic atrribute:
        System.out.print("Creation time: ");
        System.out.println(attr.creationTime());
        System.out.print("Last access time: ");
        System.out.println(attr.lastAccessTime());
        System.out.print("a file/folder/symlink?");
        System.out.println(": " + attr.isOther());
        System.out.print("File key: ");
        System.out.println(attr.fileKey());
    }
}
