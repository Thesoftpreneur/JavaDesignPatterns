package com.amberlion.otherStuff.streams;

import java.util.stream.Stream;

public class Peeking {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6)
                .peek(n -> System.out.println(n + " is peeked"))
                .filter(Peeking::isEven)
                .peek(n-> System.out.println(n+" is filtered since its even"))
                .map(n -> n*n)
                .peek(n-> System.out.println("The even number is squared and is equal" + n))
                .reduce(0, Integer::sum);
        // 4 + 16 + 36 == 56
        System.out.println("The sum of squares of even numbers is " + sum);
    }
}
