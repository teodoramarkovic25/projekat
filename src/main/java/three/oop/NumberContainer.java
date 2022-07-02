package three.oop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/*
Dvije vrste generičkih tipova
1.UNBOUNDED
2. BOUNDED extends  granica


džokerski tipovi
?
 */
public class NumberContainer<B extends Number> implements Iterable<B> {
    private int capacity = 0;
    private Number[] numbers = new Number[capacity];


    //public NumberContainer() {
    //     for (int i = 0; i < numbers.length; i++) {
    //        numbers[i] = i;
    //   }

    // }

    @Override
    public Iterator<B> iterator() {
        return new NumberIterator();
    }

    public void function(Consumer<? super Integer> action) {

    }

    public boolean add(B broj) {
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity - 1] = broj;
        return true;

    }

    public boolean remove(B broj) {
        if (broj == null) {
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == null) {
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == broj) {
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }

        }
        return true;
    }

    private class NumberIterator implements Iterator<B> {
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            //System.out.println("Poziv inner klas enkapsuliranje hasNext()");
            return nextIndex < numbers.length;
        }

        @Override
        public B next() {
            B number = (B) numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }
}
