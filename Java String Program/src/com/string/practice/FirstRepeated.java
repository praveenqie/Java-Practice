package com.string.practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "Java Articles are Awesome";

        Character result = input.chars().mapToObj(c->Character.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() >1L).findFirst().orElseThrow().getKey();
        System.out.print(result);
    }
}
