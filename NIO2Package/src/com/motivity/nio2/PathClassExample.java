package com.motivity.nio2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("filedata.txt");
        if(!Files.exists(path))//it returns true if the file exists; false if the file does not exist or its existence cannot be determined.
        {
            System.out.println("file not available new file created");
            Files.createFile(path);
        }
        else
        {
            System.out.println("file already available ");
        }
        Path path2 = Paths.get("src/test/..");
        boolean check = Files.isSameFile(path, path2);//it returns true if, and only if, the two paths locate the same file
        System.out.println(check);

        System.out.print("Is src a folder? =  ");
        System.out.println(Files.isDirectory(path));
        System.out.print("Is src a file?  =   ");
        System.out.println(Files.isRegularFile(path));
        System.out.print("Is src a symlink? =  ");
        System.out.println(Files.isSymbolicLink(path));
        System.out.print("Is src executable?  = ");
        System.out.println(Files.isExecutable(path));
        System.out.print("Is src readable? =  ");
        System.out.println(Files.isReadable(path));
        System.out.print("Is src hidden? =  ");
        System.out.println(Files.isHidden(path));

        System.out.print("src size : = ");
        System.out.println(Files.size(path));
    }
}