package com.string.practice;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character jas = input.chars().mapToObj(s->Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(data->data.getValue() == 1).findFirst().orElseThrow().getKey();

        System.out.print(jas);


    }


}
