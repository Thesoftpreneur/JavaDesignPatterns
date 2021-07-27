package com.amberlion.otherStuff.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsRegexReplace {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "20", "A1", "333", "A2A211");

        for (String number : numbers) {
            System.out.println(number.replaceAll("\\d", "#"));
        }

        // Java 8 stream example
        numbers.stream()
                .map(x -> x.replaceAll("\\d", "#"))
                .forEach(System.out::println);
    }
}
