package com.algorithm.sorting.practice;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        int length = arr.length;
        for(int i=0;i<length-1;i++) {
            int min_idx = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx  = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
//One loop to select an element of Array one by one = O(N)
//Another loop to compare that element with every other Array element = O(N)
//Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)
