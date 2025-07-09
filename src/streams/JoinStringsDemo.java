package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("red", "green", "blue", "yellow");
        String newWords = String.join(", ", words);

        System.out.println(newWords);

    }
}
