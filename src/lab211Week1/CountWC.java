package lab211Week1;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map;

public class CountWC {
    private String input;

    public CountWC(String input) {
        this.input = input;
    }

    Map<String, Integer> countWord() {
        StringTokenizer st1 = new StringTokenizer(input);
        Map<String, Integer> wordCount = new HashMap<>();
        while (st1.hasMoreElements()) {
            String word = st1.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    Map<Character, Integer> countCharacter() { // Sửa tên phương thức
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        return charCount;
    }
}
