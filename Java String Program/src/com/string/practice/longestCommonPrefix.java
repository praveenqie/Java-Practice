package com.string.practice;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        withoutStream();
        //withStream();
    }

    private static void withoutStream() {
        String[] a = {"praveen", "prashanth", "praful", "prakruti"};
        int size = a.length;


        Arrays.sort(a);


        // find the minimum length from first and last string
        int end = Math.min(a[0].length(), a[size-1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) ){
            i++;
        }
        String pre = a[0].substring(0, i);
        System.out.println(pre);

    }

    private static void withStream() {
        String[] a = {"praveen", "prashanth", "praful", "prakruti"};
        int size = a.length;
        Arrays.sort(a);
        int minLength = Arrays.stream(a)
                .mapToInt(String::length).min().orElse(0);
        String first = a[0];
        String last = a[a.length - 1];

        String prefix = Arrays.stream(first.split(""))
                .limit(minLength)
                .takeWhile(c -> first.startsWith(c) && last.startsWith(c))
                .reduce("", (acc, c) -> acc + c);

        System.out.println(prefix);
    }
}
