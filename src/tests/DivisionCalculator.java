package tests;

public class DivisionCalculator {
    public static double divide(int a, int b) {
        if (b==0){
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a / b;

    }
}