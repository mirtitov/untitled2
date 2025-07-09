package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Vova", 21),
                new Person("Nona", 31),
                new Person("Sasha", 22),
                new Person("Poli", 44),
                new Person("Vadik", 11)
        );


        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparingInt(Person::age)
                        .thenComparing(Person::name))
                .toList();

        sortedPersons.forEach(System.out::println);
    }
}