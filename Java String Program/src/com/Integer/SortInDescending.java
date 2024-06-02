package com.Integer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInDescending {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //Or
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
