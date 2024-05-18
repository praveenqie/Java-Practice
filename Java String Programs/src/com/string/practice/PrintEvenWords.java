package com.string.practice;

import java.util.Arrays;

public class PrintEvenWords {
    public static void main(String[] args) {
        withoutStream();
        withStream();
    }
    public static void withoutStream(){
        String sentence  = "i am trying to print even length words";
        String [] words = sentence.split(" ");
        for(String word:words){
            if(word.length()%2 ==0){
                System.out.println(word);
            }
        }
    }
    public static void withStream(){
        String sentence  = "i am trying to print even length words";
        Arrays.stream(sentence.split("\\s+")).filter(word-> word.length() %2==0).forEach(System.out::println);
    }
}
