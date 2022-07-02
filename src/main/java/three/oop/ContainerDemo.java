package three.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ContainerDemo {
    public static void main(String[] args) {

// vrati ArraysList objekat
        List<String> strings = new ArrayList<>();
        strings.add("Dino");
        strings.add("Ena");
        strings.add("Semra");
        strings.add("Bilal");
        strings.add("Bilal");
        //Arrays.asList("Dino", "Ena", "Semra", "Bilal", "Bilal");
        strings.remove("Bilal");
        strings.remove("Bilal");
        Iterator<String> iterator = strings.iterator();
        strings.forEach(System.out::println);
        NumberContainer<Integer> integerNumberContainer = new NumberContainer<>();
        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
        for (Number number : integerNumberContainer) {

        }

        // implemenrtacija ArrayListiteratora iz arraylist
        //LinkedListIterator
        //  ArrayList<Integer> arrayList = new ArrayList<>();
        //   for (Integer number : arrayList) {
        //  System.out.println(number);
        // }
    }
}
