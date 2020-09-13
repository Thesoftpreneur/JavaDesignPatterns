package com.amberlion.otherStuff.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BuilderPattern {
    public static void main(String[] args) {
        Stream<String> stream = Stream.<String>builder()
                .add("Ken")
                .add("Jeff")
                .add("Chris")
                .add("Ellen")
                .build();
        //Obtain a builder
        Stream.Builder<String> builder = Stream.builder();
        //Obtain elements and build a stream
        Stream<String> stream2 = builder.add("Maven")
                .add("Java")
                .add("Monica")
                .build();

        List<String> names = new ArrayList<>();
        names.add("LOLO");
        names.add("Miki");
        System.out.println(names);
        stream.forEach(names::add);
        stream2.forEach(n -> names.add(n));
        System.out.println(names);

    }


}
