package com.amberlion.otherStuff.streams;


import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1,2,3)
                .flatMap(n->Stream.of(n, n*n));

        intStream.forEach(System.out::println);
    }
}
