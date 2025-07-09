package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");
        String minString = words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("Такого слова нет");

        System.out.println("Слово с минимальным количеством букв: " + minString);


    }
}
