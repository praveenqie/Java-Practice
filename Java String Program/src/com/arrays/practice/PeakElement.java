package com.arrays.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PeakElement {
    public static void main(String[] args) {
        withoutStream();
        withStream();
    }

    private static void withStream() {

        int[] arr = {5, 10, 20, 15};
        int n= arr.length;
        if (n == 1)
            System.out.println("Peek Element is"+arr[0]);
        if (arr[0] >= arr[1])
            System.out.println("Peek Element is"+arr[0]);
        if (arr[n - 1] >= arr[n - 2])
            System.out.println("Peek Element is"+arr[n-1]);
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){
                System.out.println("Peek Element is"+arr[i]);
            }

        }
    }

    private static void withoutStream() {
        int[] arr = {5, 10, 20, 15};
        int n= arr.length;

        Arrays.stream(arr)
                .boxed()
                .flatMapToInt(i -> IntStream.range(0, arr.length)
                .filter(index -> (index == 0 || arr[index] >= arr[index - 1])
                && (index == arr.length - 1 || arr[index] >= arr[index + 1]))
                .map(index -> arr[index])).distinct()
                .forEach(peak -> System.out.println("Peak Element is " + peak));


    }


}
