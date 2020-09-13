package com.amberlion.otherStuff.streams;

import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        Stream<Long> tenNaturalNumbers = Stream.iterate(2L, n -> n+2)
                .skip(10) // skip 10 elements
                .limit(10); // length of the stream
        tenNaturalNumbers.forEach(n -> System.out.print(n + ", "));
    }
}
