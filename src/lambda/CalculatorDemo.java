package lambda;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = Integer::sum;
        int result = add.operate(5,7);
        System.out.println("Сумма: " + result);

    }
}
