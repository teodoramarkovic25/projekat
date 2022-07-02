package three.oop;

import java.util.Iterator;
import java.util.function.Consumer;

public class NumberContainerDemo {
    public static void main(String[] args) {
        NumberContainer<Integer> numberContainer = new NumberContainer<>();
        numberContainer.add(23);
        numberContainer.add(25);
        numberContainer.add(2345);
        numberContainer.add(null);
        Consumer<Double> doubleConsumer = doubleBroj -> System.out.println(doubleBroj);
        Consumer<Integer> integerConsumer = integerBroj -> System.out.println(integerBroj);
        numberContainer.function(integerConsumer);
       for (Integer number : numberContainer) {
           System.out.println(number);
    }
      /*  Iterator<Integer> numberIterator = numberContainer.iterator();
        while (numberIterator.hasNext()) {
            Integer number = numberIterator.next();
            System.out.println(number);
        }

       */
    }
}
