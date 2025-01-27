package school.lesson8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "pear", "banana", "apple", "plum", "orange", "pear", "plum", "apple", "banana", "orange", "pear"};
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Count of each word: " + wordCount);
    }
}