package com.string.practice;

import java.util.Arrays;
import java.util.List;

public class CountCharacterOccurrence {
    public static void main(String[] args) {
        withoutStream();
        withStream();
    }
    static void withoutStream(){
        String s = "Java is java again java again";
        char c = 'a';
        int count = s.length() - s.replace(Character.toString(c) ,"").length();
        System.out.println(count);
    }
    static void withStream(){

        String s = "Java is java again java again";
        char c = 'a';
       long count = s.chars().filter(ch->ch==c).count();
       System.out.println(count);
    }

}


