package com.amberlion.otherStuff.consumer;

import java.util.function.Consumer;

public class PrintConsumer
{
    public static void main(String[] args)
    {
        Consumer printer = str -> {
            System.out.println(str);
            System.out.println("Gogo");
        };
        printer.accept("Welcome");
        printer.accept("JavaInterviewPoint");
    }
}