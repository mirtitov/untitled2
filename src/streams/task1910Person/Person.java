package streams.task1910Person;

class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Метод для удобного вывода информации
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}