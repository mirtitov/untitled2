package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
        new Person ("Vova",21),
        new Person ("Sophia", 22),
        new Person ("Vadim", 33)
        );

        List<Person> filtered = persons.stream()
                .filter(s -> s.age() > 30)
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

    }
}
