package one.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
čitanje bajta
FileInputStream
FileOutputStream

čitanje karakter po karakter
FileReader
FileWriter

linija po linije
BufferedReader  in
PrintWriter   out
 */
public class CopyLines {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("bigfajl.txt"));
             PrintWriter out = new PrintWriter("bigfajlout.txt")) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
