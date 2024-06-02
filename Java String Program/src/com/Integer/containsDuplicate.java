package com.Integer;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1,2,3};

        HashSet<Integer> data = new HashSet<>();
        long a = Arrays.stream(nums).boxed().filter(p-> !data.add(p)).count();
        System.out.println(a > 0);
        System.out.print(LocalDateTime.now());
    }


}
