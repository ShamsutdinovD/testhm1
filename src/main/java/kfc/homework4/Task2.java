package kfc.homework4;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("f", "f", "i", "q", "z", "z", "i", "r");
        String result = findFirstUnique(list);
        System.out.println("Первый не повторяющийся элемент: " + result);
    }

    public static <T> T findFirstUnique(List<T> list) {
        Map<T, Integer> counts = new LinkedHashMap<>();
        for (T item : list) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }
        for (T item : list) {
            if (counts.get(item) == 1) {
                return item;
            }
        }
        return null;
    }
}
