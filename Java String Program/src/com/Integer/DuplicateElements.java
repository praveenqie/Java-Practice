package com.Integer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> duplicates = new HashSet<>();
         myList.stream().filter(n->!duplicates.add(n)).forEach(System.out::print);
    }
}
