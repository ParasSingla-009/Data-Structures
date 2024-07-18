package com.fileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter Some letters");
//            int letters = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(FileReader fr = new FileReader("C:\\Users\\mrpar\\Documents\\d.s.a\\Practice\\src\\com\\fileHandling\\notes.txt")){
            int letters = fr.read();
            while (fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You Typed:" + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        // byte to char stream and reading char stream

        //output
        OutputStream os = System.out;
//        os.write();

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
                osw.write("Hello World");
                osw.write(97);
                osw.write(10);
                osw.write('A');
                osw.write(10);
                char[] arr = "hello world".toCharArray();
                osw.write(arr);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\mrpar\\Documents\\d.s.a\\Practice\\src\\com\\fileHandling\\notes.txt", true)){
                fw.write("this should be appended");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
