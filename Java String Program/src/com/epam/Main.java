package com.epam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str ="E!@#P$a m% ^&*()_n+|-y=w(e)r_s{t}i[o]n-s?";
        Character result = getNonRepeatedCharacters(str);
        if(Objects.nonNull(result)){
            System.out.println(result);
        }

    }

    private static Character getNonRepeatedCharacters(String str) {

        return str.chars().mapToObj(c->Character.toLowerCase((char) c)).filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(a->a.getValue() == 1).findFirst().orElseThrow().getKey();


    }
}
