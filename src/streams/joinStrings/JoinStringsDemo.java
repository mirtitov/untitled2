package streams.joinStrings;

import java.util.Arrays;
import java.util.List;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("red", "green", "blue", "yellow");
        String newWords = String.join(", ", words);

        System.out.println(newWords);

    }
}
