package com.interview;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {2, 1, 4, 2, 3, 5, 4, 2, 5};
        int[] output = removeDuplicatesAndFill(input);

        System.out.println(Arrays.toString(output));
    }

    public static int[] removeDuplicatesAndFill(int[] input) {
        int[] output = new int[input.length];
        boolean[] seen = new boolean[100]; // Assuming input values are between 0 and 99
        int index = 0;

        for (int num : input) {
            if (!seen[num]) {
                seen[num] = true;
                output[index++] = num;
            }
        }

        // Fill the remaining positions with -1
        while (index < output.length) {
            output[index++] = -1;
        }

        return output;
    }
}
