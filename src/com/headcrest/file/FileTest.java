package com.headcrest.file;

import java.io.File;
import java.nio.file.Paths;

public class FileTest {
    public static void main(String[] args) {

        //System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());

        File f = new File("src/com/headcrest/file/Test.txt");

        if (f.exists()) {
            System.out.println("Exists");
        }
        else
            System.out.println("Does not exist");
    }
}
