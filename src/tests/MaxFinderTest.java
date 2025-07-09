package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxFinderTest {
    @Test
    void findMax(){
        int [] numbers = {1,2,3,4,5};
        Assertions.assertEquals(5,MaxFinder.findMax(numbers));

    }

}