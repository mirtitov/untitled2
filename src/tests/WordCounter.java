package tests;

public class WordCounter {
    public static int countWords(String text) {
    if (text == null || text.trim().isEmpty()) {
        return 0;
    }
    // Разделение по любым пробельным символам
    String[] words = text.trim().split("\\s+");
    return words.length;
}
    }

