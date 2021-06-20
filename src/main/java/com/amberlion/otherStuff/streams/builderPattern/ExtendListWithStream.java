package com.amberlion.otherStuff.streams.builderPattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtendListWithStream {
    public static void main(String[] args) {

        // Create a list of employers
        List<String> staff = Stream.<String>builder()
                .add("Ken")
                .add("Jeff")
                .add("Chris")
                .add("Ellen")
                .build()
                .collect(Collectors.toList());

        // This stream has new employers that are gonna be added to the staff list
        Stream<String> newStaff = Stream.<String>builder()
                .add("George")
                .add("James")
                .build();

        // The new employers are added to the employers list
        newStaff
                .peek(n -> System.out.println(n + " is peeked and going to be added to staff."))
                .forEach(staff::add);
        System.out.println(staff);

    }

}
