package com.string.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
        withoutStream();
       withStream();
    }

    private static void withStream() {
        String s = "i like this program very much ";
        String reverse = Arrays.stream(s.split( " "))
                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
            Collections.reverse(list);
            return list.stream();
        })).collect(Collectors.joining(" "));
        System.out.println(" With Stream " +reverse);

    }

    static void withoutStream() {
        String s = "i like this program very much ";

        String[]  words = s.split(" ");

        StringBuilder reverse = new StringBuilder();

        for ( int i=words.length-1;i>=0;i--){
            reverse.append(words[i]).append(" ");
        }
        System.out.println(reverse);
    }
}
