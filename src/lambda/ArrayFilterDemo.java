package lambda;

import java.util.ArrayList;
import java.util.List;



public class ArrayFilterDemo {
    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : array) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 12, 7, 20, 3};

        // Используем лямбда-выражение для фильтрации чисел больше 10
        List<Integer> filteredNumbers = filterArray(numbers, n -> n > 10);

        // Выводим результат
        System.out.println(filteredNumbers);  // [12, 20]
    }
}

