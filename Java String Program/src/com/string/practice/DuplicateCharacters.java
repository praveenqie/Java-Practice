package com.string.practice;

import java.util.Arrays;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String word = "PraveeeeenKumar";
        word.chars().mapToObj(c->(char) c).distinct().forEach(System.out::print);
    }
}
