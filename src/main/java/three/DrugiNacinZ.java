package three;

import java.util.Arrays;

public class DrugiNacinZ {
    public static void main(String[] args) {
        int[] numbers = {12, 34454, 2, 343, 45, 67, 88888, 35, 5, 23};


        //int j = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean sortirani = true;
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                sortirani = false;
            }

            //if (!sortirani && i == numbers.length - 2) {
             //   i = 0;

            //}
        }


        for (int number : numbers) {
            System.out.println(number);
        }
        String numbersString = Arrays.toString(numbers);

    }
}

