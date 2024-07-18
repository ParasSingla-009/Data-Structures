package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        // create a file
        try {
            File fo = new File("C:\\Users\\mrpar\\Documents\\d.s.a\\Practice\\src\\com\\fileHandling\\new-file.txt");
            fo.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // write a file
        try (FileWriter fw = new FileWriter("C:\\Users\\mrpar\\Documents\\d.s.a\\Practice\\src\\com\\fileHandling\\new-file.txt", true)){
            fw.write("this should be appended");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
