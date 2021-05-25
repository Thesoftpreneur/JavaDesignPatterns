package com.amberlion.otherStuff.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExampleBasics {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        //queue mode
        deque.offerLast("Element 1");
        deque.offerLast("Element 2");

        String element1 = deque.pollFirst();
        String element2 = deque.pollFirst();

        //Stack mode
        deque.offerFirst("Element 1");
        deque.offerFirst("Element 2");

        element2 = deque.pollFirst();
        element1 = deque.pollFirst();

    }
}
