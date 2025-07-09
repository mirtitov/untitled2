package lambda;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] words = {"Java", "Lambda", "Stream", "API"};

        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));


        System.out.println("Отсортированный массив по длине: " + Arrays.toString(words));
    }
}
