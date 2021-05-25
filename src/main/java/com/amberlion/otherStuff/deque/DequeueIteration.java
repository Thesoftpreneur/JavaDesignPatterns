package com.amberlion.otherStuff.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueIteration {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.offer("element 1");
        deque.offer("element 2");
        deque.offer("element 3");

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String element : deque) {
            System.out.println(element);
        }

        deque.stream().forEach((element)-> {
            System.out.println(element);
        });

        deque.forEach(System.out::println);
    }
}
