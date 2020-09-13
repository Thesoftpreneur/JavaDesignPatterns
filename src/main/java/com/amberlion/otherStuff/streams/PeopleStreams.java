package com.amberlion.otherStuff.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello");

        List<String> names = Person.persons().stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
