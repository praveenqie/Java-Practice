package com.string.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordOccurrences {

    public static void main(String[] args) {
        withoutStream();
        withStream();

    }
        static void withoutStream()
        {
           String inputString = "Bread butter and bread";
             String[] words = inputString.split(" ");
            HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
            for (String word : words)
            {
                if(wordCount.containsKey(word.toLowerCase()))
                {
                    wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
                }
                else
                {
                   wordCount.put(word.toLowerCase(), 1);
                }
            }
            Set<String> wordsInString = wordCount.keySet();
          for (String word : wordsInString)
            {
             if(wordCount.get(word) > 1)
                {
                System.out.println(word+" : "+wordCount.get(word));
                }
            }
        }
       static void withStream(){
        String inputString = "Bread butter and bread";

         Map<String ,Long>  data = Arrays.stream(inputString.split(" ")).map(String :: toLowerCase)
                  .collect(Collectors.groupingBy(word->word,Collectors.counting()));

         data.entrySet().stream().
                 filter(word->word.getValue()>1).
                 forEach(words -> System.out.println(words.getKey() + " : " + words.getValue()));

    }


}
