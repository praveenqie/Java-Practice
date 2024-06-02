package com.interview;

import java.util.*;


public class WasteOfTime {

    // Define constants
    public static final int MOD = 1000000007;

    // Define the mapping of characters to numbers
    static  Map<Character, int[]> charToNumbers = new HashMap<>();
    static {
        charToNumbers.put('a', new int[]{1, 2});
        charToNumbers.put('b', new int[]{3, 4});
        charToNumbers.put('c', new int[]{5, 6});
        charToNumbers.put('d', new int[]{7, 8});
        charToNumbers.put('e', new int[]{9, 10, 11});
        charToNumbers.put('f', new int[]{12, 13});
        charToNumbers.put('g', new int[]{14, 15});
        charToNumbers.put('h', new int[]{16});
    }

    public int wasteOfTime(String input1) {
        List<int[]> mappedNumbers = new ArrayList<>();

        // Convert the input string to list of number arrays
        for (char c : input1.toCharArray()) {
            mappedNumbers.add(charToNumbers.get(c));
        }

        // Recursive function to generate combinations and sum them
        return sumCombinations(mappedNumbers, 0, 0) % MOD;
    }

    private int sumCombinations(List<int[]> mappedNumbers, int index, int currentSum) {
        if (index == mappedNumbers.size()) {
            return currentSum;
        }

        int sum = 0;
        for (int num : mappedNumbers.get(index)) {
            sum = (sum + sumCombinations(mappedNumbers,
                    index + 1, (currentSum + num) % MOD)) % MOD;
        }

        return sum;
    }

    public static void main(String[] args) {
        WasteOfTime instance = new WasteOfTime();
        // Test cases
        System.out.println(instance.wasteOfTime("e")); // Output: 30
        System.out.println(instance.wasteOfTime("ade")); // Output: 228
    }
}
