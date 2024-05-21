package com.string.practice;

import java.util.Arrays;

public class CountTheWords {

    public static void main(String[] args) {
        withoutStream();
        withStream();
    }
    static void withoutStream(){
        String sentence = "Java IntStream class is a specialization of Stream interface for int primitive";

        String[] words = sentence.split(" ");
        System.out.println(" Number of words in sentence is "+words.length);


    }
    static void withStream(){
        String sentence = "Java IntStream class is a specialization of Stream interface for int primitive";

        System.out.println("Using Stream =" +Arrays.stream(sentence.split(" ")).count());

    }
}
