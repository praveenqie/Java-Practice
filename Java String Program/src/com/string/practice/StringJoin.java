package com.string.practice;

import java.util.stream.IntStream;

public class StringJoin {

    public static void main(String[] args) {
            withoutStream();
            withStream();
        }
        public static void withoutStream(){
        StringBuilder newString;
        String originalString = "My String";
        String newStringToBeInserted = "New";
        int newIndex = 2;

//        for(int i=0;i<originalString.length();i++){
//            newString.append(originalString.charAt(i));
//            if(i==newIndex){
//                newString.append(newStringToBeInserted);
//            }
//        }
            newString  = new StringBuilder(originalString.substring(0, newIndex + 1)
                    + newStringToBeInserted
                    + originalString.substring(newIndex + 1));
            System.out.println(newString);
    }
         public static void withStream(){
             String originalString = "My String";
             String newStringToBeInserted = "New";
             int newIndex = 2;
             StringBuilder newString = new StringBuilder();
             IntStream.range(0,originalString.length()).forEach(
                     i->{
                         newString.append(originalString.charAt(i));
                         if(i == newIndex){
                             newString.append(newStringToBeInserted);
                         }
                     }
             );
             System.out.println(newString);
         }
}
