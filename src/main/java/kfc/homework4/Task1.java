package kfc.homework4;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String input = "ffiqzzyyynq";
        Map<Character, Integer> counts = countCharacters(input);
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : str.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}
