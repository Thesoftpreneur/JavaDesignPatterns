package com.amberlion.otherStuff.streams.builderPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2Streams {
    public static void main(String[] args) {

        Stream<String> streamA = Stream.<String>builder()
                .add("Ken A")
                .add("Jeff A")
                .add("Chris A")
                .add("Ellen A")
                .build();

        Stream<String> streamB = Stream.<String>builder()
                .add("Ken B")
                .add("Jeff B")
                .add("Chris B")
                .add("Ellen B")
                .build();

        Stream<String> emptyStream = Stream.empty();

        Stream<String> concatenatedStream = Stream.concat(Stream.concat(streamA, streamB), emptyStream);

        concatenatedStream.forEach(System.out::println);
    }
}
