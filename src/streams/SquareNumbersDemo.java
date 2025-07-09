package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arrayNew = numbers.stream()
                .map(n -> n*n)
                .toList();

        arrayNew.forEach(System.out::println);
    }
}
