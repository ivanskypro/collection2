package ru.pro.sky;

import java.util.*;

public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(28,1, 10, 2, 3, 4, 4, 5, 5, 12, 7));
    private static List<String> words = new ArrayList<>(List.of("Иван", "Иван", "Сергей", "Дмитрий", "Дмитрий", "Алексей"));

    public static void main(String[] args) {
        checkOdd();
        checkEven();
        removeDuplicates();
        printDuplicates();


    }
    public static void checkOdd () {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num +","+ " " );
            }
        }
        System.out.println();
    }

    public static void checkEven() {
        List<Integer> uniqueNums = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(uniqueNums);
        uniqueNums.sort(Comparator.naturalOrder());
        for (Integer num : uniqueNums) {
            if (num % 2 == 0) {
            }
        }
        System.out.print(uniqueNums);
        System.out.println();

    }

    public static void removeDuplicates() {

        Set<String> uniqueWords = new HashSet<>(words);
        List<String> duplicatedWords = new ArrayList<>(words);
        for (String uniqueWord : uniqueWords) {
            duplicatedWords.remove(uniqueWord);
        }
        uniqueWords.removeAll(duplicatedWords);
        System.out.println(uniqueWords);

    }

    public static void printDuplicates() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
