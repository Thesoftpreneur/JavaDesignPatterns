package com.amberlion.otherStuff.atomicTypes;

import java.util.concurrent.atomic.AtomicInteger;

public class TheAtomicInteger {


    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println(counter.getAndIncrement());
        System.out.println(counter.getAndIncrement());
        System.out.println(counter.getAndIncrement());
    }
}
