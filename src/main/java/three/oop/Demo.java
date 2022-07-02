package three.oop;

import one.exceptions.Person;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        String line = new Scanner(System.in).nextLine();
        int broj = Integer.parseInt(line);
        Float floatNfloat = Float.parseFloat(line);
        System.out.println(broj);

        NumberContainer<Integer> integerNumberContainer = new NumberContainer<>();
        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
        for(Number number : integerNumberContainer){

        }
    }
}
