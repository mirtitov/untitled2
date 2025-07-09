package streams;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
        long newNumbers =  numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();

        System.out.println("Кол-во четных чисел: " + newNumbers);


    }


}
