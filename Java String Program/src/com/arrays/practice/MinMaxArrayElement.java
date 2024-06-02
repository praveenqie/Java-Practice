package com.arrays.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MinMaxArrayElement {

    public static void main(String[] args) {
        withoutStream();
    }

    private static void withoutStream() {
        int[] a={1,423,6,46,34,23,13,53,4};

        Arrays.sort(a);

        // Reverse the array using streams
        System.out.println("Min Element "+a[0]+" Max Element "+a[a.length-1] );
    }
}
