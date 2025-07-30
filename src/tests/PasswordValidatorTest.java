package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void passwordValidatorShorter8Symbols(){
        String password = "12345";
        assertFalse(PasswordValidator.isValid(password));
    }
    @Test
    void passwordValidatorWithoutNumbers(){
        String password = "abcdef";
        assertFalse(PasswordValidator.isValid(password));
    }
    @Test
    void passwordValidatorIsCorrect(){
        String password = "abcdeef1234";
        assertTrue(PasswordValidator.isValid(password));
    }
    @Test
    void passwordValidatorIsEmpty(){
        String password = "";
        assertFalse(PasswordValidator.isValid(password));
    }

}
