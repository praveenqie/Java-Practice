package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWord {

    public static void main(String[] args) {
        String Sentence = "The word am looking for longest length";
        String[] words = Sentence.split(" ");
        Optional<String> word = Arrays.stream(Sentence.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(2).findFirst();
        System.out.println(word);

    }

}
