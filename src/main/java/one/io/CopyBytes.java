package one.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
pročitati sadržaj/podatke iz fajl1.txt
čuvamo podatke u Java programu
pišemo podatke iz Java programa u faj2.txt


java.io
FileInputStream  in
FileOutputStream  out
 */
public class CopyBytes {
    public static void main(String[] args) {
//try-with-resource


        try(  FileInputStream in = new FileInputStream("fajl1.txt");
              FileOutputStream out = new FileOutputStream("output1.txt");){
            int bytePodatka;
        while (( bytePodatka = in.read())!=-1){
            out.write(bytePodatka);
        }

        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
