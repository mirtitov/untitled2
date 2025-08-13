package streams.uniqueValues;

import java.util.Arrays;
import java.util.List;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        List<Integer> newNum = num.stream()
                .distinct()
                .toList();
        System.out.println("Новый список: " + newNum);
    }
}
