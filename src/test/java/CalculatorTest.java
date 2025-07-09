package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    @Test
    void sum(){
        Calculator calculator = new Calculator();
        int sum = calculator.sum(10,15);
        Assertions.assertEquals(25,sum);

    }
}
