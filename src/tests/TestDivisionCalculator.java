package tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDivisionCalculator {
    @Test
    void divide(){
        Assertions.assertEquals(2, DivisionCalculator.divide(10,5));
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(4, 0));
    }


}
