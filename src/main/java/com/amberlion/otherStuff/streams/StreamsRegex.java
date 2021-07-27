package com.amberlion.otherStuff.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRegex {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "20", "A1", "333", "A2A211");
//Traditional loop approach
//        for (String number : numbers) {
//
//            if (number.matches("\\d+")) {
//                System.out.println(number);		// 1, 20, 333
//            }
//        }

        // Java 8 stream example
        numbers.stream()
                .filter(x -> x.matches("\\d+"))
                .forEach(System.out::println);

        List<String> onlyNumbers = numbers.stream()
                .filter(x -> x.matches("\\d+"))
                .collect(Collectors.toList());

    }
}
