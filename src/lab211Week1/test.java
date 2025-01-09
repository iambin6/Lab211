package lab211Week1;

import java.util.Map;

public class test {
    public static void main(String[] args) {
        String input = "Hello the world";
        CountWC counter = new CountWC(input);
        Map<String, Integer> wordResult = counter.countWord();
        Map<Character, Integer> charResult = counter.countCharacter(); // Gọi phương thức đúng tên
        System.out.println("Count result: " + wordResult);
        System.out.println("Character result: " + charResult);
    }
}
