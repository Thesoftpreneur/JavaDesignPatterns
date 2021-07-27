package com.amberlion.otherStuff.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class PrintConsumerStream
{
    public static void main(String[] args)
    {
        AtomicInteger counter = new AtomicInteger();
        Consumer printer = str -> {
            counter.getAndIncrement();
            System.out.println(counter.toString() + ". " + str);
        };
        //Consumer printer = System.out::println;

        List countryList = Arrays.asList("India", "Australia", "France",
                "Canada");
        // Prints all elements of CountryList into a neat numbered list
        countryList.stream().forEach(printer);

        // Puts all elements of CountryList into a HashMap
        AtomicInteger counter2 = new AtomicInteger();
        Map<Integer, String> countedMap = new HashMap<>();
        countryList.stream().forEach(i ->countedMap.put(counter2.getAndIncrement()+1, i.toString()));
        System.out.println(countedMap);
    }
}