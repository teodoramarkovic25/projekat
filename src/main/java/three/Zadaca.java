package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Zadaca {
    public static void main(String[] args) {
        //brojevi
        int[] numbers = {12, 34454, 2, 343, 45, 67, 88888, 35, 5, 23};

        for (int i = 0; i < numbers.length; i++) {
            // i=0
            for (int j = i+1; j < numbers.length; j++) {
                //j=1,2,3,4,5,6,7,8,9,
                if (numbers[i] > numbers[j]) {
                    Integer temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }


        }
        for (int number : numbers) {
            System.out.println(number);
        }
       String numbersString = Arrays.toString(numbers);


        //ispis brojeva - nema sortiranja
        // Stream<Integer> integerStream = Stream.of(numbers);
        //Consumer<Integer> consumer = System.out::println;
        // integerStream.forEach(consumer);


    }
}
