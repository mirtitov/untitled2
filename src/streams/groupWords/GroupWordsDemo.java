package streams.groupWords;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot");

        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        groupedByFirstLetter.forEach((letter, list) -> {
            System.out.println(letter + ": " + list);
        });
    }
}


