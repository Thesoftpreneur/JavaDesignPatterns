package com.amberlion.otherStuff.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sumOfOddSquares = numbers.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("sumOfOddSquares:"+sumOfOddSquares);

        Iterator<Integer> iterator = numbers.stream().iterator();
        while(iterator.hasNext()) {
            System.out.println("Iteration:"+iterator.next());
        }
    }
}
