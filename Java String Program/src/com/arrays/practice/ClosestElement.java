package com.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//Given a sorted array of unique elements in increasing order, arr[] of n integers, and a value x. Find the K closest elements to x in arr[].
//Keep the following points in mind:
//
//If x is present in the array, then it need not be considered.
//If two elements have the same difference as x, the greater element is prioritized.
//If sufficient elements are not present on the right side, take elements from the left and vice versa.
//
//Example 1:
//
//Input:
//n = 13
//arr[] = {12, 16, 22, 30, 35, 39, 42,
//         45, 48, 50, 53, 55, 56}
//k = 4, x = 35
//Output: 39 30 42 45
//Explanation:
//First closest element to 35 is 39.
//Second closest element to 35 is 30.
//Third closest element to 35 is 42.
//And fourth closest element to 35 is 45.
//
//Example 2:
//
//Input:
//n = 5
//arr[] = {1, 2, 3, 6, 10}
//k = 3, x = 4
//Output: 3 6 2
//Explanation:
//First closest element is 3.
//There are two elements 2 and 6 for which
//the difference with 4 is same i.e. 2.
//So first take greatest number 6
//then the lower number 2.
public class ClosestElement {

    public static void main(String[] args) {
        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int k = 4;
        int x = 35;

        int[] result = findKClosestElements(arr, k, x);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findKClosestElements(int[] arr, int k, int x) {
        int n = arr.length;

        // Binary search to find the closest index
        int closestIndex = Arrays.binarySearch(arr, x);
        if (closestIndex < 0) {
            closestIndex = -closestIndex - 1;
        }

        int left = closestIndex - 1;
        int right = closestIndex;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        while (left >= 0 && right < n && k > 0) {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);

            if (leftDiff <= rightDiff) {
                minHeap.add(new int[]{leftDiff, arr[left]});
                left--;
            } else {
                minHeap.add(new int[]{rightDiff, arr[right]});
                right++;
            }
            k--;
        }

        while (k > 0 && left >= 0) {
            minHeap.add(new int[]{Math.abs(arr[left] - x), arr[left]});
            left--;
            k--;
        }

        while (k > 0 && right < n) {
            minHeap.add(new int[]{Math.abs(arr[right] - x), arr[right]});
            right++;
            k--;
        }

        int[] result = new int[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll()[1];
        }

        return result;
    }

}
