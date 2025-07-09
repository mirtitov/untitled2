package lambda;



public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier string = s -> s.toUpperCase() + "!";
        String result = string.modify("vova");
        System.out.println("Изначальный текст: vova");
        System.out.println("В верхний регистр: " + result);

    }
}
