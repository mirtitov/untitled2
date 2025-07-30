package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {
    @Test
    void testCountWordsNormalText(){
        String text = "Hello java";
        assertEquals(2, WordCounter.countWords(text));
    }
    @Test
    void testCountWordsEmptyString() {
        String text = "";
        assertEquals(0, WordCounter.countWords(text));
    }

    @Test
    void testCountWordsMultipleSpaces() {
        String text = "Hello    world";
        assertEquals(2, WordCounter.countWords(text));
    }

    @Test
    void testCountWordsWithTabAndNewLine() {
        String text = "Hello\tworld\nexample";
        assertEquals(3, WordCounter.countWords(text));
    }

    @Test
    void testCountWordsNullString() {
        String text = null;
        assertEquals(0, WordCounter.countWords(text));
    }
}
