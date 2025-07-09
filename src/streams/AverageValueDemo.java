package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        double average = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее значение: " + average);
    }
}
