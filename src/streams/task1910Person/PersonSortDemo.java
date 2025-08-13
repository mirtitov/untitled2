package streams.task1910Person;

import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Анна", 25),
                new Person("Борис", 30),
                new Person("Виктор", 25),
                new Person("Галина", 22),
                new Person("Дмитрий", 30)
        );


        List<Person> sortedPeople = people.stream()
                .sorted((p1, p2) -> {
                    int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
                    return ageComparison != 0 ? ageComparison : p1.getName().compareTo(p2.getName());
                })
                .toList();

        System.out.println("Отсортированный список:");
        for (Person person : sortedPeople) {
            System.out.println(person);
        }
    }
}
