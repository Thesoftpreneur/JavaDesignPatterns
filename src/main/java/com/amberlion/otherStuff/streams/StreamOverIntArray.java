package com.amberlion.otherStuff.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamOverIntArray {

    /*
        Counts the number of occurences of each element
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{5,2,3,4,5,2,3,3,3,22,3};
        Map<Integer, Integer> students = new HashMap<>();

        Arrays.stream(numbers)
                .distinct()
                .forEach(i-> students.put(i, Math.toIntExact(Arrays.stream(numbers)
                        .filter(j->j==i)
                        .count())));

        System.out.println(students);
    }
}
