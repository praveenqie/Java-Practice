package com.string.practice;

public class NonRepeatedChars {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
      input.chars().mapToObj(c->(char)c).distinct().forEach(System.out::print);
    }
}
