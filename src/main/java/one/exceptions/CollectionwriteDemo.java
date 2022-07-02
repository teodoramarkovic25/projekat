package one.exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//OUTER klasa
// polje ili atribute   static instanc
//konstruktor
// funkcije ili metode static ili instance
public class CollectionwriteDemo {
    private List<Integer> numbers;

    public CollectionwriteDemo()  {
        numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }
    public void writeNumbers() {
        try ( //Reader reader = new Reader();
             FileWriter fileWriter = new FileWriter("utput.txt");
             PrintWriter out = new PrintWriter(fileWriter);) {

            out.println("Vozdra raja");
            for (int number : numbers) {
                out.println(number);
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("ne postoji taj fajl");


        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
