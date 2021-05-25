package com.amberlion.otherStuff.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class GenericDeque {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        deque.offer(Integer.valueOf(123));
        deque.offer("Hello, Deque");

        Integer element1 = (Integer) deque.poll();
        String element2 = (String) deque.poll();

        Deque<String> deque2 = new ArrayDeque<>();
        deque2.offer("Hello, Deque");
    }
}
