package com.amberlion.otherStuff.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sumOfOddSquares = numbers.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("sumOfOddSquares_:"+sumOfOddSquares);

        int sumOfOddSquares2 = numbers.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a+b);
        System.out.println("sumOfOddSquares2:"+sumOfOddSquares2);

        Iterator<Integer> iterator = numbers.stream().iterator();
        while(iterator.hasNext()) {
            System.out.println("Iteration:"+iterator.next());
        }

        Stream<Integer> allNumbers = numbers.stream();
        System.out.println("Even numbers ->");
        allNumbers.filter(n-> n%2 == 0).forEach(System.out::print);
        //System.out.println("Even numbers:" + evenNumbers);
    }
}
