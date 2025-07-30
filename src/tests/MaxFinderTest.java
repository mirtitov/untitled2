package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxFinderTest {
    @Test
    void findMaxSingleElement(){
        int [] numbers = {1,2,3,4,5};
        Assertions.assertEquals(5,MaxFinder.findMax(numbers));
    }

    @Test
    void findMaxNegativeelemen(){
        int [] numbers = {-10,-15,-5};
        Assertions.assertEquals(-5,MaxFinder.findMax(numbers));
    }
    @Test
    void findMaxRepetedValues(){
        int [] numbers = {7,7,7};
        Assertions.assertEquals(7,MaxFinder.findMax(numbers));
    }

    @Test
    void findMaxEmptyArray(){
        int [] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> MaxFinder.findMax(numbers));
    }

}