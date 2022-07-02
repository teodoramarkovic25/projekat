package one.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Loše stvari se dešavaju u našem programu bez obzira što smo fenemenalan programer


detektujemo i obradimo greške ili loše stvari
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Dobro došli na advanced javu programing");

        int number=23;
                int[] numbers = new int[6];
                numbers[0]=23;
                //Kreira se objekat ArrayindexuotofBoundException
                numbers[6]=54;  //loše stvari //bačen izuzetak exception
        //Exceptional Event koji je prekinuo normalan tok izvršavanja našeg programa
        System.out.println("Ova je prava stvar");
        Person p1=null;
        ispis(p1);
        System.out.println("ovo je druga prava stvar");
        System.out.println("unesi ime fajla");
        String filename = new Scanner(System.in).nextLine();
        //PROVJERAVANI - try catch finally
        try {
            readFile(filename);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Ne postoji fajl" + fileNotFoundException.getMessage());
        }
        finally {
            //zatvaramo resurse
        }
    }
    private static void ispis(Person person){
        System.out.println(person.getName());//NullPointerException

    }
    private static void readFile(String filename) throws FileNotFoundException {
        //čita fajl sa imenom filename
        File file = new File(filename);
        if (file.exists()){
//čitamo fajl
        }
        else{
            throw new FileNotFoundException();
        }


    }
}
